package com.itheima.pojo;

import javax.annotation.Generated;

public class WorldCountryRegion {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String countrycode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String regioncode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String regionname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String regionnamezh;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String regionnamezhdic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCountrycode() {
        return countrycode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegioncode() {
        return regioncode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode == null ? null : regioncode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegionname() {
        return regionname;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegionnamezh() {
        return regionnamezh;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegionnamezh(String regionnamezh) {
        this.regionnamezh = regionnamezh == null ? null : regionnamezh.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRegionnamezhdic() {
        return regionnamezhdic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRegionnamezhdic(String regionnamezhdic) {
        this.regionnamezhdic = regionnamezhdic == null ? null : regionnamezhdic.trim();
    }

    @Override
    public String toString() {
        return "WorldCountryRegion{" +
                "id=" + id +
                ", countrycode='" + countrycode + '\'' +
                ", regioncode='" + regioncode + '\'' +
                ", regionname='" + regionname + '\'' +
                ", regionnamezh='" + regionnamezh + '\'' +
                ", regionnamezhdic='" + regionnamezhdic + '\'' +
                '}';
    }
}