package com.itheima.dao;

import static com.itheima.dao.WorldCountryCityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.itheima.pojo.WorldCountryCity;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

@Mapper
public interface WorldCountryCityMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WorldCountryCity> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WorldCountryCityResult")
    WorldCountryCity selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WorldCountryCityResult", value = {
        @Result(column="locId", property="locid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="continentCode", property="continentcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="continentName", property="continentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="continentNameZh", property="continentnamezh", jdbcType=JdbcType.VARCHAR),
        @Result(column="countryISOCode", property="countryisocode", jdbcType=JdbcType.VARCHAR),
        @Result(column="countryName", property="countryname", jdbcType=JdbcType.VARCHAR),
        @Result(column="countryNameZh", property="countrynamezh", jdbcType=JdbcType.VARCHAR),
        @Result(column="regionCode", property="regioncode", jdbcType=JdbcType.VARCHAR),
        @Result(column="regionName", property="regionname", jdbcType=JdbcType.VARCHAR),
        @Result(column="regionNameZh", property="regionnamezh", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="cityZh", property="cityzh", jdbcType=JdbcType.VARCHAR),
        @Result(column="postalCode", property="postalcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="metroCode", property="metrocode", jdbcType=JdbcType.VARCHAR),
        @Result(column="areaCode", property="areacode", jdbcType=JdbcType.VARCHAR)
    })
    List<WorldCountryCity> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(worldCountryCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCountryCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String locid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, worldCountryCity)
                .where(locid, isEqualTo(locid_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(WorldCountryCity record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCountryCity)
                .map(locid).toProperty("locid")
                .map(continentcode).toProperty("continentcode")
                .map(continentname).toProperty("continentname")
                .map(continentnamezh).toProperty("continentnamezh")
                .map(countryisocode).toProperty("countryisocode")
                .map(countryname).toProperty("countryname")
                .map(countrynamezh).toProperty("countrynamezh")
                .map(regioncode).toProperty("regioncode")
                .map(regionname).toProperty("regionname")
                .map(regionnamezh).toProperty("regionnamezh")
                .map(city).toProperty("city")
                .map(cityzh).toProperty("cityzh")
                .map(postalcode).toProperty("postalcode")
                .map(latitude).toProperty("latitude")
                .map(longitude).toProperty("longitude")
                .map(metrocode).toProperty("metrocode")
                .map(areacode).toProperty("areacode")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(WorldCountryCity record) {
        return insert(SqlBuilder.insert(record)
                .into(worldCountryCity)
                .map(locid).toPropertyWhenPresent("locid", record::getLocid)
                .map(continentcode).toPropertyWhenPresent("continentcode", record::getContinentcode)
                .map(continentname).toPropertyWhenPresent("continentname", record::getContinentname)
                .map(continentnamezh).toPropertyWhenPresent("continentnamezh", record::getContinentnamezh)
                .map(countryisocode).toPropertyWhenPresent("countryisocode", record::getCountryisocode)
                .map(countryname).toPropertyWhenPresent("countryname", record::getCountryname)
                .map(countrynamezh).toPropertyWhenPresent("countrynamezh", record::getCountrynamezh)
                .map(regioncode).toPropertyWhenPresent("regioncode", record::getRegioncode)
                .map(regionname).toPropertyWhenPresent("regionname", record::getRegionname)
                .map(regionnamezh).toPropertyWhenPresent("regionnamezh", record::getRegionnamezh)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(cityzh).toPropertyWhenPresent("cityzh", record::getCityzh)
                .map(postalcode).toPropertyWhenPresent("postalcode", record::getPostalcode)
                .map(latitude).toPropertyWhenPresent("latitude", record::getLatitude)
                .map(longitude).toPropertyWhenPresent("longitude", record::getLongitude)
                .map(metrocode).toPropertyWhenPresent("metrocode", record::getMetrocode)
                .map(areacode).toPropertyWhenPresent("areacode", record::getAreacode)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCountryCity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, locid, continentcode, continentname, continentnamezh, countryisocode, countryname, countrynamezh, regioncode, regionname, regionnamezh, city, cityzh, postalcode, latitude, longitude, metrocode, areacode)
                .from(worldCountryCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<WorldCountryCity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, locid, continentcode, continentname, continentnamezh, countryisocode, countryname, countrynamezh, regioncode, regionname, regionnamezh, city, cityzh, postalcode, latitude, longitude, metrocode, areacode)
                .from(worldCountryCity);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default WorldCountryCity selectByPrimaryKey(String locid_) {
        return SelectDSL.selectWithMapper(this::selectOne, locid, continentcode, continentname, continentnamezh, countryisocode, countryname, countrynamezh, regioncode, regionname, regionnamezh, city, cityzh, postalcode, latitude, longitude, metrocode, areacode)
                .from(worldCountryCity)
                .where(locid, isEqualTo(locid_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(WorldCountryCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryCity)
                .set(locid).equalTo(record::getLocid)
                .set(continentcode).equalTo(record::getContinentcode)
                .set(continentname).equalTo(record::getContinentname)
                .set(continentnamezh).equalTo(record::getContinentnamezh)
                .set(countryisocode).equalTo(record::getCountryisocode)
                .set(countryname).equalTo(record::getCountryname)
                .set(countrynamezh).equalTo(record::getCountrynamezh)
                .set(regioncode).equalTo(record::getRegioncode)
                .set(regionname).equalTo(record::getRegionname)
                .set(regionnamezh).equalTo(record::getRegionnamezh)
                .set(city).equalTo(record::getCity)
                .set(cityzh).equalTo(record::getCityzh)
                .set(postalcode).equalTo(record::getPostalcode)
                .set(latitude).equalTo(record::getLatitude)
                .set(longitude).equalTo(record::getLongitude)
                .set(metrocode).equalTo(record::getMetrocode)
                .set(areacode).equalTo(record::getAreacode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(WorldCountryCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryCity)
                .set(locid).equalToWhenPresent(record::getLocid)
                .set(continentcode).equalToWhenPresent(record::getContinentcode)
                .set(continentname).equalToWhenPresent(record::getContinentname)
                .set(continentnamezh).equalToWhenPresent(record::getContinentnamezh)
                .set(countryisocode).equalToWhenPresent(record::getCountryisocode)
                .set(countryname).equalToWhenPresent(record::getCountryname)
                .set(countrynamezh).equalToWhenPresent(record::getCountrynamezh)
                .set(regioncode).equalToWhenPresent(record::getRegioncode)
                .set(regionname).equalToWhenPresent(record::getRegionname)
                .set(regionnamezh).equalToWhenPresent(record::getRegionnamezh)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityzh).equalToWhenPresent(record::getCityzh)
                .set(postalcode).equalToWhenPresent(record::getPostalcode)
                .set(latitude).equalToWhenPresent(record::getLatitude)
                .set(longitude).equalToWhenPresent(record::getLongitude)
                .set(metrocode).equalToWhenPresent(record::getMetrocode)
                .set(areacode).equalToWhenPresent(record::getAreacode);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(WorldCountryCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryCity)
                .set(continentcode).equalTo(record::getContinentcode)
                .set(continentname).equalTo(record::getContinentname)
                .set(continentnamezh).equalTo(record::getContinentnamezh)
                .set(countryisocode).equalTo(record::getCountryisocode)
                .set(countryname).equalTo(record::getCountryname)
                .set(countrynamezh).equalTo(record::getCountrynamezh)
                .set(regioncode).equalTo(record::getRegioncode)
                .set(regionname).equalTo(record::getRegionname)
                .set(regionnamezh).equalTo(record::getRegionnamezh)
                .set(city).equalTo(record::getCity)
                .set(cityzh).equalTo(record::getCityzh)
                .set(postalcode).equalTo(record::getPostalcode)
                .set(latitude).equalTo(record::getLatitude)
                .set(longitude).equalTo(record::getLongitude)
                .set(metrocode).equalTo(record::getMetrocode)
                .set(areacode).equalTo(record::getAreacode)
                .where(locid, isEqualTo(record::getLocid))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(WorldCountryCity record) {
        return UpdateDSL.updateWithMapper(this::update, worldCountryCity)
                .set(continentcode).equalToWhenPresent(record::getContinentcode)
                .set(continentname).equalToWhenPresent(record::getContinentname)
                .set(continentnamezh).equalToWhenPresent(record::getContinentnamezh)
                .set(countryisocode).equalToWhenPresent(record::getCountryisocode)
                .set(countryname).equalToWhenPresent(record::getCountryname)
                .set(countrynamezh).equalToWhenPresent(record::getCountrynamezh)
                .set(regioncode).equalToWhenPresent(record::getRegioncode)
                .set(regionname).equalToWhenPresent(record::getRegionname)
                .set(regionnamezh).equalToWhenPresent(record::getRegionnamezh)
                .set(city).equalToWhenPresent(record::getCity)
                .set(cityzh).equalToWhenPresent(record::getCityzh)
                .set(postalcode).equalToWhenPresent(record::getPostalcode)
                .set(latitude).equalToWhenPresent(record::getLatitude)
                .set(longitude).equalToWhenPresent(record::getLongitude)
                .set(metrocode).equalToWhenPresent(record::getMetrocode)
                .set(areacode).equalToWhenPresent(record::getAreacode)
                .where(locid, isEqualTo(record::getLocid))
                .build()
                .execute();
    }
}