package com.kgc.mapper;

import com.kgc.pojo.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
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
    /**
     * 根据商品的订单id判断是否含有评论
     * @param reviewOrderItemId
     * @return
     */
    Integer isReivew(Integer reviewOrderItemId);
}
