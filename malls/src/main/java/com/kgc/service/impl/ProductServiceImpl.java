package com.kgc.service.impl;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.Product;
import com.kgc.service.ProductService;
import com.kgc.tool.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    @Override
    public PageUtil<Product> getProduct(Integer pageIndex, Integer pageSize, String productName, Integer productCategoryId, Integer MaxMon, Integer MinMon, Object... productIsEnabled) {
        return null;
    }

    @Override
    public List<Product> getAllProduct(String productName, Integer productCategoryId) {
        return productMapper.getAllProduct(productName,productCategoryId);
    }


    @Override
    public Integer AddProduct(String productName, String productTitle, float productPrice, float productSalePrice, Integer productCategoryId, String productimageSrc, Integer productimageType, Integer productId, Integer propertyValueId, Object... productIsEnabled) {
        return null;
    }

    @Override
    public List<Product> getPromotion() {
        return productMapper.getPromotion();
    }

    @Override
    public List<Product> getProduct(String productName) {
        return productMapper.getProduct(productName);
    }
}
