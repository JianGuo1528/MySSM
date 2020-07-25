package com.itheima.pojo;

import java.util.Arrays;

public class Hotel {
    /**
     * id	name	address	style	price
     * 1	A酒店	Los Angeles	双人房	120.00
     */
    private Integer id;
    private String name;
    private String address;
    private String style;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int[] show(int[] i) {
        System.out.println(Arrays.toString(i));
        return new int[]{1000};
    }
}
