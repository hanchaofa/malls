package com.kgc.service.fore;

import com.kgc.pojo.Productorder;
import com.kgc.pojo.Review;

import java.util.List;
import java.util.Map;

/**
 * 订单业务（接口）
 */
public interface ProductOrderService {
    /**
     * 下单
     * @param productorder 商品订单信息
     * @param productNumList 商品数量集合
     * @return 执行结果：是否成功
     */
    boolean addOrder(Productorder productorder, Map<Integer, Integer> productNumList);

    /**
     * 评价订单
     * @param review 评论对象
     * @return 执行结果：是否成功
     */
    boolean addReview(Review review);

    /**
     * 支付
     * @param productorderId 商品订单编号
     * @return 执行结果：是否成功
     */
    boolean makePayment(Integer productorderId);

    /**
     * 用户订单查询
     * @return 订单集合
     * @param productorderUserId 用户编号
     */
    List<Productorder> getOrderList(Integer productorderUserId);

    /**
     * 根据订单状态查询订单
     * @param productorderStatus 订单状态
     * @param productorderUserId 用户编号
     * @return 订单集合
     */
    List<Productorder> getOrderListByStatus(Integer productorderStatus, Integer productorderUserId);
}
