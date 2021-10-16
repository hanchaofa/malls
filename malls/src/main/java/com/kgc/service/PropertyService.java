package com.kgc.service;

import com.kgc.pojo.Property;

import java.util.List;

public interface PropertyService {
    /**
     *  根据商品的类型查询出当前类型，属性值的集合
     * @param propertyCategoryId
     * @return 属性值集合
     */
    List<Property> getProperty(Integer propertyCategoryId);
    Integer AddProperty(Integer propertyCategoryId);

}
