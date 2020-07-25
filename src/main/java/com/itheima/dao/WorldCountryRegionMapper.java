package com.itheima.dao;

import com.itheima.pojo.WorldCountryRegion;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import javax.annotation.Generated;
import java.util.List;

import static com.itheima.dao.WorldCountryRegionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Mapper
public interface WorldCountryRegionMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<WorldCountryRegion> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("WorldCountryRegionResult")
    WorldCountryRegion selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "WorldCountryRegionResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "countryCode", property = "countrycode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "regionCode", property = "regioncode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "regionName", property = "regionname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "regionNameZh", property = "regionnamezh", jdbcType = JdbcType.VARCHAR),
            @Result(column = "regionNameZhDic", property = "regionnamezhdic", jdbcType = JdbcType.VARCHAR)
    })
    List<WorldCountryRegion> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(worldCountryRegion);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCountryRegion);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCountryRegion)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(WorldCountryRegion record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCountryRegion)
                .map(id).toProperty("id")
                .map(countrycode).toProperty("countrycode")
                .map(regioncode).toProperty("regioncode")
                .map(regionname).toProperty("regionname")
                .map(regionnamezh).toProperty("regionnamezh")
                .map(regionnamezhdic).toProperty("regionnamezhdic")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(WorldCountryRegion record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCountryRegion)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(countrycode).toPropertyWhenPresent("countrycode", record::getCountrycode)
                .map(regioncode).toPropertyWhenPresent("regioncode", record::getRegioncode)
                .map(regionname).toPropertyWhenPresent("regionname", record::getRegionname)
                .map(regionnamezh).toPropertyWhenPresent("regionnamezh", record::getRegionnamezh)
                .map(regionnamezhdic).toPropertyWhenPresent("regionnamezhdic", record::getRegionnamezhdic)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCountryRegion>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, countrycode, regioncode, regionname, regionnamezh, regionnamezhdic)
                .from(worldCountryRegion);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCountryRegion>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, countrycode, regioncode, regionname, regionnamezh, regionnamezhdic)
                .from(worldCountryRegion);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default WorldCountryRegion selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, countrycode, regioncode, regionname, regionnamezh, regionnamezhdic)
                .from(worldCountryRegion)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(WorldCountryRegion record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryRegion)
                .set(id).equalTo(record::getId)
                .set(countrycode).equalTo(record::getCountrycode)
                .set(regioncode).equalTo(record::getRegioncode)
                .set(regionname).equalTo(record::getRegionname)
                .set(regionnamezh).equalTo(record::getRegionnamezh)
                .set(regionnamezhdic).equalTo(record::getRegionnamezhdic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(WorldCountryRegion record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryRegion)
                .set(id).equalToWhenPresent(record::getId)
                .set(countrycode).equalToWhenPresent(record::getCountrycode)
                .set(regioncode).equalToWhenPresent(record::getRegioncode)
                .set(regionname).equalToWhenPresent(record::getRegionname)
                .set(regionnamezh).equalToWhenPresent(record::getRegionnamezh)
                .set(regionnamezhdic).equalToWhenPresent(record::getRegionnamezhdic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(WorldCountryRegion record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryRegion)
                .set(countrycode).equalTo(record::getCountrycode)
                .set(regioncode).equalTo(record::getRegioncode)
                .set(regionname).equalTo(record::getRegionname)
                .set(regionnamezh).equalTo(record::getRegionnamezh)
                .set(regionnamezhdic).equalTo(record::getRegionnamezhdic)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(WorldCountryRegion record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryRegion)
                .set(countrycode).equalToWhenPresent(record::getCountrycode)
                .set(regioncode).equalToWhenPresent(record::getRegioncode)
                .set(regionname).equalToWhenPresent(record::getRegionname)
                .set(regionnamezh).equalToWhenPresent(record::getRegionnamezh)
                .set(regionnamezhdic).equalToWhenPresent(record::getRegionnamezhdic)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}