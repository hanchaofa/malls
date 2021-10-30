package com.kgc.service.impl;

import com.kgc.mapper.ProductorderitemMapper;
import com.kgc.pojo.Productorderitem;
import com.kgc.service.ProductorderitemService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductorderitemServiceImpl implements ProductorderitemService {
    @Resource
    ProductorderitemMapper productorderitemMapper;
    @Override
    public Integer AddProductOrderitem(Productorderitem productorder) {
        return productorderitemMapper.AddProductOrderitem(productorder);
    }

    @Override
    public List<Productorderitem> getProductOrderitem(Integer productorderUserId) {
        return productorderitemMapper.getProductOrderitem(productorderUserId);
    }

    @Override
    public Integer UpProductOrderitem(Integer productorderitemProductId, Integer productorderitemuserId,Integer product_number) {
        return productorderitemMapper.UpProductOrderitem(productorderitemProductId,productorderitemuserId,product_number);
    }

    @Override
    public Integer DelProductOrder(Integer productorderitemProductId) {
        return productorderitemMapper.DelProductOrder(productorderitemProductId);
    }

    @Override
    public List<Productorderitem> getProdctOrderItemById(Integer productorderitemOrderId) {
        return productorderitemMapper.getProdctOrderItemById(productorderitemOrderId);
    }
}
