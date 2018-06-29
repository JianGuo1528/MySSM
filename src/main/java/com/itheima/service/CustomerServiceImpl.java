package com.itheima.service;

import com.itheima.dao.CustomerMapper;
import com.itheima.dao.DictMapper;
import com.itheima.dao.HotelMapper;
import com.itheima.pojo.BaseDict;
import com.itheima.pojo.Customer;
import com.itheima.pojo.Hotel;
import com.itheima.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private DictMapper dictMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<BaseDict> findDictByCode(String code) {
        return dictMapper.findDictByCode(code);
    }

    @Override
    public List<Customer> findCustomerByVo(QueryVo vo) {
        return customerMapper.findCustomerByVo(vo);
    }

    @Override
    public Integer findCustomerCountByVo(QueryVo vo) {
        return customerMapper.findCustomerCountByVo(vo);
    }

    @Override
    public List<Hotel> findAllHotels() {
        return hotelMapper.findAllHotels();
    }

}
