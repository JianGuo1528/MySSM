package com.itheima.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WorldCityAbroadDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final WorldCityAbroad worldCityAbroad = new WorldCityAbroad();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = worldCityAbroad.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> continent = worldCityAbroad.continent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> country = worldCityAbroad.country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cityZh = worldCityAbroad.cityZh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cityEn = worldCityAbroad.cityEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pageurl = worldCityAbroad.pageurl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class WorldCityAbroad extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> continent = column("continent", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("country", JDBCType.VARCHAR);

        public final SqlColumn<String> cityZh = column("city_zh", JDBCType.VARCHAR);

        public final SqlColumn<String> cityEn = column("city_en", JDBCType.VARCHAR);

        public final SqlColumn<String> pageurl = column("PageUrl", JDBCType.VARCHAR);

        public WorldCityAbroad() {
            super("world_city_abroad");
        }
    }
}