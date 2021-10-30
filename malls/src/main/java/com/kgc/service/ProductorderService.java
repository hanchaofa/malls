package com.kgc.service;

import com.kgc.pojo.Product;
import com.kgc.pojo.Productorder;
import com.kgc.tool.PageUtil;

import java.util.List;

/**
 * 订单业务逻辑层
 */
public interface ProductorderService {
    /**
     *  订单分页
     * @param pageIndex
     * @param pageSize
     * @param productorderAddress（地区邮政编码）
     * @param productorderCode（订单编号名称）
     * @param productorderStatus（订单状态）
     * @return 订单表的分页
     */
    PageUtil<Productorder> getProductorderPage(Integer pageIndex,Integer pageSize,
                                                   String productorderAddress,String productorderCode,
                                                   Object... productorderStatus);
    Integer updateProductorder();

    /**
     * 根据订单的productId进行双表（Productorder与productorderitem）查询
     * @param productId
     * @return
     */
    Product getProductorder(Integer productId);

    /**
     * 通过商品ID获取商品卖出量
     * @param ProductId
     * @return
     */
    Integer getNumber(Integer ProductId);

    /**
     * 个人订单分页，根据状态进行分页展示
     * @param pageIndex
     * @param pageSize
     * @param status
     * @return
     */
    PageUtil<Productorder> getOrderForPage(Integer pageIndex,Integer pageSize,Integer status,Integer productorderUserId);
}
