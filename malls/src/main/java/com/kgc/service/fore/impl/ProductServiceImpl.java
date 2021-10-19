package com.kgc.service.fore.impl;

import com.kgc.mapper.fore.ProductMapper;
import com.kgc.pojo.Product;
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
    public Product getProductById(Integer id) {
        return null;
    }
}