package com.kgc.mapper;

import com.kgc.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
        List<Product> getAllProduct(@Param("productName") String productName,
                                    @Param("productCategoryId") Integer productCategoryId
                );
        /**
         * 前台获取促销的商品，进行轮播展示
         * @return
         */
        List<Product> getPromotion();

        /**
         * 前台搜索
         * @param productName
         * @return
         */
        List<Product> getProduct(@Param("productName")String productName);
        /**
         * 获取商品类型下的商品
         * @param productCategoryId
         * @return
         */
        List<Product> getPageByCate(Integer productCategoryId);
}
