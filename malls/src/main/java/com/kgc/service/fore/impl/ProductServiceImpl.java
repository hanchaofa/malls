package com.kgc.service.fore.impl;

import com.kgc.pojo.Product;
import com.kgc.service.fore.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品业务（实现类）
 */
@Service
public class ProductServiceImpl implements ProductService {
    // 在此注入ProductMapper

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