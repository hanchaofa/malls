package com.kgc.service;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.Product;
import com.kgc.tool.PageUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单层的业务逻辑层方法
 */
public interface ProductService {

    /**
     * 产品页面的分页
     * @param pageIndex
     * @param pageSize
     * @param productName（产品名称）
     * @param productCategoryId（产品类型ID）
     * @param productIsEnabled（产品状态）
     * @param MaxMon（最高价格）
     * @param MinMon（最低价格）
     * @return 返回分页对象
     */
    PageUtil<Product> getProduct(Integer pageIndex,Integer pageSize,
                             String productName,Integer productCategoryId,
                                 Integer MaxMon,Integer MinMon,Object...productIsEnabled
    );

    /**
     * 根据名称、状态、和商品类型进行查询
     * @param productName
     * @param productCategoryId
     * @return
     */
    List<Product> getAllProduct(String productName,Integer productCategoryId);



    /**
     *  此方法适用于两个操作，新增和修改，使用动态SQL进行操作
     * @param productName(商品名称)
     * @param productTitle（商品标题）
     * @param productPrice（商品原价）
     * @param productSalePrice（商品特价）
     * @param productCategoryId（商品类型）
     * @param productIsEnabled（商品状态）
     * @param productimageSrc（商品图片地址）
     * @param productimageType（商品图片类型）
     * @param productId(商品的ID)
     * @return Integer
     */
    Integer AddProduct(String productName,String productTitle,float productPrice
                               ,float productSalePrice,Integer productCategoryId
            ,String productimageSrc,Integer productimageType
            ,Integer productId,Integer propertyValueId,Object...productIsEnabled);


}
