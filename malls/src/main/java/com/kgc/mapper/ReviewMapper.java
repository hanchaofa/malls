package com.kgc.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    /**
     * 通过商品编号获取商品评论数量
     * @param ProductId
     * @return
     */
    Integer getReiew(Integer ProductId);
}
