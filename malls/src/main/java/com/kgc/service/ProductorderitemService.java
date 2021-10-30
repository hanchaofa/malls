package com.kgc.service;

import com.kgc.pojo.Productorder;
import com.kgc.pojo.Productorderitem;

import java.util.List;

public interface ProductorderitemService {
    /**
     * 新增商品订单
     * @param productorder
     * @return
     */
    Integer AddProductOrderitem(Productorderitem productorder);

    /**
     * 获取购物车集合，根据用户ID
     * @param productorderUserId
     * @return
     */
    List<Productorderitem> getProductOrderitem(Integer productorderUserId);
    /**
     * 通过查询出的数量，如果购物车含有此商品，增加此商品数量
     * @param productorderitemProductId
     * @param productorderitemuserId
     * @return
     */
    Integer UpProductOrderitem(Integer productorderitemProductId,Integer productorderitemuserId,Integer product_number);
    /**
     * 根据商品的ID，进行删除购物车商品
     * @param productorderitemProductId
     * @return
     */
    Integer DelProductOrder(Integer productorderitemProductId);
    /**
     * 根据订单id，获取订单明细集合
     * @param productorderitemOrderId
     * @return
     */
    List<Productorderitem> getProdctOrderItemById(Integer productorderitemOrderId);
}
