package com.itheima.service;

import com.itheima.pojo.BaseDict;
import com.itheima.pojo.Customer;
import com.itheima.pojo.Hotel;
import com.itheima.pojo.QueryVo;

import java.util.List;

public interface CustomerService {

    List<BaseDict> findDictByCode(String code);

    List<Customer> findCustomerByVo(QueryVo vo);

    Integer findCustomerCountByVo(QueryVo vo);

    List<Hotel> findAllHotels();
}
