package com.itheima.dao;

import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {
    List<Customer> findCustomerByVo(QueryVo vo);

    Integer findCustomerCountByVo(QueryVo vo);
}
