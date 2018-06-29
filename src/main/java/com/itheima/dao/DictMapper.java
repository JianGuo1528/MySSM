package com.itheima.dao;

import com.itheima.pojo.BaseDict;

import java.util.List;

public interface DictMapper {
    List<BaseDict> findDictByCode(String code);
}
