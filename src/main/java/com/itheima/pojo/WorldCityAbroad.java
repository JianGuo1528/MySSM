package com.itheima.pojo;

import javax.annotation.Generated;

public class WorldCityAbroad {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String continent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String country;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cityZh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cityEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pageurl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContinent() {
        return continent;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCountry() {
        return country;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCityZh() {
        return cityZh;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCityZh(String cityZh) {
        this.cityZh = cityZh == null ? null : cityZh.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCityEn() {
        return cityEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCityEn(String cityEn) {
        this.cityEn = cityEn == null ? null : cityEn.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPageurl() {
        return pageurl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    @Override
    public String toString() {
        return "WorldCityAbroad{" +
                "id=" + id +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", cityZh='" + cityZh + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", pageurl='" + pageurl + '\'' +
                '}';
    }
}