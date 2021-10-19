package com.kgc.service.fore.impl;

import com.kgc.pojo.Productorder;
import com.kgc.pojo.Review;
import com.kgc.service.fore.ProductOrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 订单业务（实现类）
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    // 在此注入ProductOrderMapper

    @Override
    public boolean addOrder(Productorder productorder, Map<Integer, Integer> productNumList) {
        // 调用订单数据访问层新增方法

        // 遍历集合，调用订单明细表数据访问层新增方法

        return false;
    }

    @Override
    public boolean addReview(Review review) {
        return false;
    }

    @Override
    public boolean makePayment(Integer productorderId) {
        Productorder productorder = new Productorder();
        productorder.setProductorderId(productorderId);
        productorder.setProductorderStatus(1);   // 订单状态设置为1：待发货
        // 调用订单数据访问层更新方法

        return false;
    }

    @Override
    public List<Productorder> getOrderList(Integer productorderUserId) {
        return null;
    }

    @Override
    public List<Productorder> getOrderListByStatus(Integer productorderStatus, Integer productorderUserId) {
        return null;
    }
}
