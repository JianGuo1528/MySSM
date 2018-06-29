package com.itheima.dao;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;

public final class WorldCountryRegionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final WorldCountryRegion worldCountryRegion = new WorldCountryRegion();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = worldCountryRegion.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> countrycode = worldCountryRegion.countrycode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regioncode = worldCountryRegion.regioncode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionname = worldCountryRegion.regionname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionnamezh = worldCountryRegion.regionnamezh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> regionnamezhdic = worldCountryRegion.regionnamezhdic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class WorldCountryRegion extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> countrycode = column("countryCode", JDBCType.VARCHAR);

        public final SqlColumn<String> regioncode = column("regionCode", JDBCType.VARCHAR);

        public final SqlColumn<String> regionname = column("regionName", JDBCType.VARCHAR);

        public final SqlColumn<String> regionnamezh = column("regionNameZh", JDBCType.VARCHAR);

        public final SqlColumn<String> regionnamezhdic = column("regionNameZhDic", JDBCType.VARCHAR);

        public WorldCountryRegion() {
            super("world_country_region");
        }
    }
}