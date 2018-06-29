package com.itheima.dao;

import com.itheima.pojo.Hotel;

import java.util.List;

public interface HotelMapper {
    List<Hotel> findAllHotels();
}
