package com.itheima.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WorldCountryCityDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final WorldCountryCity worldCountryCity = new WorldCountryCity();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> locid = worldCountryCity.locid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> continentcode = worldCountryCity.continentcode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> continentname = worldCountryCity.continentname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> continentnamezh = worldCountryCity.continentnamezh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> countryisocode = worldCountryCity.countryisocode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> countryname = worldCountryCity.countryname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> countrynamezh = worldCountryCity.countrynamezh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regioncode = worldCountryCity.regioncode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionname = worldCountryCity.regionname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionnamezh = worldCountryCity.regionnamezh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = worldCountryCity.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cityzh = worldCountryCity.cityzh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> postalcode = worldCountryCity.postalcode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> latitude = worldCountryCity.latitude;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> longitude = worldCountryCity.longitude;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> metrocode = worldCountryCity.metrocode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> areacode = worldCountryCity.areacode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class WorldCountryCity extends SqlTable {
        public final SqlColumn<String> locid = column("locId", JDBCType.VARCHAR);

        public final SqlColumn<String> continentcode = column("continentCode", JDBCType.VARCHAR);

        public final SqlColumn<String> continentname = column("continentName", JDBCType.VARCHAR);

        public final SqlColumn<String> continentnamezh = column("continentNameZh", JDBCType.VARCHAR);

        public final SqlColumn<String> countryisocode = column("countryISOCode", JDBCType.VARCHAR);

        public final SqlColumn<String> countryname = column("countryName", JDBCType.VARCHAR);

        public final SqlColumn<String> countrynamezh = column("countryNameZh", JDBCType.VARCHAR);

        public final SqlColumn<String> regioncode = column("regionCode", JDBCType.VARCHAR);

        public final SqlColumn<String> regionname = column("regionName", JDBCType.VARCHAR);

        public final SqlColumn<String> regionnamezh = column("regionNameZh", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> cityzh = column("cityZh", JDBCType.VARCHAR);

        public final SqlColumn<String> postalcode = column("postalCode", JDBCType.VARCHAR);

        public final SqlColumn<String> latitude = column("latitude", JDBCType.VARCHAR);

        public final SqlColumn<String> longitude = column("longitude", JDBCType.VARCHAR);

        public final SqlColumn<String> metrocode = column("metroCode", JDBCType.VARCHAR);

        public final SqlColumn<String> areacode = column("areaCode", JDBCType.VARCHAR);

        public WorldCountryCity() {
            super("world_country_city");
        }
    }
}