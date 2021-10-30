package com.kgc.service.impl;

import com.kgc.mapper.ProductimageMapper;
import com.kgc.pojo.Productimage;
import com.kgc.service.ProductimageService;
import com.kgc.service.ProductorderService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductimageServiceImpl implements ProductimageService {
    @Resource
    ProductimageMapper productimageMapper;
    @Override
    public Integer AddImage(Productimage productimage) {
        return null;
    }

    @Override
    public List<Productimage> getPImage(Integer productimageProductId) {
        return productimageMapper.getPImage(productimageProductId);
    }

    @Override
    public List<Productimage> getAllImg(Integer productimageProductId) {
        return productimageMapper.getAllImg(productimageProductId);
    }

    @Override
    public Productimage getOneImage(Integer productimageProductId) {
        return productimageMapper.getOneImage(productimageProductId);
    }


}
