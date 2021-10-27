package com.kgc.mapper;

import com.kgc.pojo.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PropertyMapper {
    /**
     * 根据商品的类型，获取属性
     * @param propertyCategoryId
     * @return
     */
    List<Property> getAllProperty(Integer propertyCategoryId);
}
