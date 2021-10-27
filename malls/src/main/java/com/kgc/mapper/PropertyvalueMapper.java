package com.kgc.mapper;

import com.kgc.pojo.Propertyvalue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PropertyvalueMapper {
    /**
     * 根据商品属性ID获取商品属性值
     * @param propertyValueProductId
     * @return
     */
    List<Propertyvalue> getAllValue(Integer propertyValueProductId);
}
