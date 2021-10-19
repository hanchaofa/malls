package com.kgc.service.fore.impl;

import com.kgc.mapper.fore.ProductMapper;
import com.kgc.pojo.Product;
import com.kgc.pojo.Property;
import com.kgc.service.fore.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品业务（实现类）
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    @Override
    public List<Property> getPropertyList(Integer productId) {
        return productMapper.getPropertyList(productId);
    }

    @Override
    public List<Product> getPromotingProductList() {
        return productMapper.getPromotingProductList();
    }

    @Override
    public List<Product> searchProductList(String productName) {
        return null;
    }

    @Override
    public List<Product> getProductListByCategory(Integer productCategoryId) {
        return null;
    }

    @Override
    public Product getProductDetail(Integer productId) {
        // 获取商品详情
        Product productDetail = productMapper.getProductDetail(productId);
        // 获取预览图片列表
        productDetail.setSingleProductImageList(productMapper.getSingleProductImageList(productId));
        // 获取详情图片列表
        productDetail.setDetailProductImageList(productMapper.getDetailProductImageList(productId));
        // 获取评论列表
        productDetail.setReviewList(productMapper.getReviewList(productId));
        return productDetail;
    }
}