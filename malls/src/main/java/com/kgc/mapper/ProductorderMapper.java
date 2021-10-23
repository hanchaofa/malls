package com.kgc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductorderMapper {
    /**
     * 通过商品ID获取商品卖出量
     * @param ProductId
     * @return
     */
    Integer getNumber(Integer ProductId);
}
