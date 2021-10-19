package com.kgc.service.fore;

import com.kgc.pojo.Product;
import com.kgc.pojo.Property;

import java.util.List;

/**
 * 商品业务（接口）
 */
public interface ProductService {
    /**
     * 获取产品参数
     * @param productId 商品编号
     * @return 商品参数集合
     */
    List<Property> getPropertyList(Integer productId);

    /**
     * 获取促销商品列表
     * @return 商品集合
     */
    List<Product> getPromotingProductList();

    /**
     * 搜索商品（模糊查询）
     * @param productName 商品名称
     * @return 商品集合
     */
    List<Product> searchProductList(String productName);

    /**
     * 商品分类查询
     * @param productCategoryId 商品分类编号
     * @return 商品集合
     */
    List<Product> getProductListByCategory(Integer productCategoryId);

    /**
     * 商品详情查询
     * @param productId 商品编号
     * @return 商品对象
     */
    Product getProductDetail(Integer productId);
}
