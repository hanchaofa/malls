package com.kgc.service;

public interface ReviewService {
    /**
     * 通过商品编号获取商品评论数量
     * @param ProductId
     * @return
     */
    Integer getReiew(Integer ProductId);
}
