package com.kgc.service;

import com.kgc.pojo.Propertyvalue;

import java.util.List;

public interface PropertyvalueService {
    /**
     * 根据商品属性ID获取商品属性值
     * @param propertyValueProductId
     * @return
     */
    List<Propertyvalue> getAllValue(Integer propertyValueProductId);
}
