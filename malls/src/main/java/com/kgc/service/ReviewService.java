package com.kgc.service;

import com.kgc.pojo.Review;

import java.util.List;

public interface ReviewService {
    /**
     * 通过商品编号获取商品评论数量
     * @param ProductId
     * @return
     */
    Integer getReiew(Integer ProductId);

    /**
     * 根据商品查询商品下的所有评论
     * @param reviewProductId
     * @return
     */
    List<Review> getReivewById(Integer reviewProductId);
}
