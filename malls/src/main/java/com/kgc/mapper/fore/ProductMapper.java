package com.kgc.mapper.fore;

import com.kgc.pojo.Product;
import com.kgc.pojo.Productimage;
import com.kgc.pojo.Property;
import com.kgc.pojo.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * 获取产品参数
     * @param productId 商品编号
     * @return 商品参数集合
     */
    List<Property> getPropertyList(Integer productId);

    /**
     * 获取商品详情
     * @param productId 商品编号
     * @return 商品对象
     */
    Product getProductDetail(Integer productId);

    /**
     * 获取预览图片列表
     * @param productId 商品编号
     * @return 预览图片集合
     */
    List<Productimage> getSingleProductImageList(Integer productId);

    /**
     * 获取详情图片列表
     * @param productId 商品编号
     * @return 详情图片集合
     */
    List<Productimage> getDetailProductImageList(Integer productId);

    /**
     * 获取商品评论列表
     * @param productId 商品编号
     * @return 评论集合
     */
    List<Review> getReviewList(Integer productId);

    /**
     * 获取促销商品列表
     * @return 商品集合
     */
    List<Product> getPromotingProductList();
}
