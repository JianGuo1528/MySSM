package com.itheima.test;

import com.itheima.dao.WorldCityAbroadMapper;
import com.itheima.dao.WorldCountryRegionMapper;
import com.itheima.pojo.WorldCityAbroad;
import com.itheima.pojo.WorldCountryRegion;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static com.itheima.dao.WorldCountryRegionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) //加载配置文件
public class SpringTest {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        System.out.println("-------Using Lambda Functions--------");

        //Using Lambda function to call system.out.println()
        myList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        System.out.println("-------Using Method Reference--------");

        //Using Method reference to call system.out.println()
        myList.stream().map(String::toUpperCase).forEachOrdered(System.out::println);
    }

    @Test
    public void test01() {
        // 使用Spring的工厂:
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        // 通过工厂获得类:
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();

        final WorldCountryRegionMapper mapper = sqlSession.getMapper(WorldCountryRegionMapper.class);

        String code = null;

        final List<WorldCountryRegion> worldCountryRegions = mapper.selectByExample().
                where(id, isLessThan(10), and(regioncode, isEqualToWhenPresent(code))).build().execute();

        System.out.println(worldCountryRegions);

        final WorldCountryRegion worldCountryRegion = worldCountryRegions.get(0);
        worldCountryRegion.setCountrycode(worldCountryRegion.getCountrycode() + "ABC");

        final Integer execute = mapper.updateByExampleSelective(worldCountryRegion).where(id, isEqualTo(worldCountryRegion.getId())).build().execute();

        System.out.println(execute);

        sqlSession.close();
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        // 通过工厂获得类:
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();

        final WorldCityAbroadMapper worldCityAbroadMapper = sqlSession.getMapper(WorldCityAbroadMapper.class);

        final List<WorldCityAbroad> worldCityAbroads = worldCityAbroadMapper.selectByExample().build().execute();

        for (WorldCityAbroad worldCityAbroad : worldCityAbroads) {
            String cityEn = worldCityAbroad.getCityEn();
            if (cityEn != null && !cityEn.trim().isEmpty()) {
                cityEn = cityEn.substring(0, 1).toUpperCase() + cityEn.substring(1);
                cityEn = cityEn.replaceAll("[\\d]{1,}", "");
                worldCityAbroad.setCityEn(cityEn);
                worldCityAbroadMapper.updateByPrimaryKeySelective(worldCityAbroad);
            }
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
