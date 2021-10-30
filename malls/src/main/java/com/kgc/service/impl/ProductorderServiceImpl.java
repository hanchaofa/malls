package com.kgc.service.impl;

import com.kgc.mapper.ProductorderMapper;
import com.kgc.pojo.Product;
import com.kgc.pojo.Productorder;
import com.kgc.service.ProductService;
import com.kgc.service.ProductorderService;
import com.kgc.tool.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductorderServiceImpl implements ProductorderService {
    @Resource
    ProductorderMapper productorderMapper;
    @Override
    public PageUtil<Productorder> getProductorderPage(Integer pageIndex, Integer pageSize, String productorderAddress, String productorderCode, Object... productorderStatus) {
        return null;
    }

    @Override
    public Integer updateProductorder() {
        return null;
    }

    @Override
    public Product getProductorder(Integer productId) {
        return productorderMapper.getProductorder(productId);
    }

    @Override
    public Integer getNumber(Integer ProductId) {
        return productorderMapper.getNumber(ProductId);
    }

    @Override
    public PageUtil<Productorder> getOrderForPage(Integer pageIndex, Integer pageSize, Integer status,Integer productorderUserId) {
        PageUtil<Productorder> pageUtil=new PageUtil<>();
        pageUtil.setPageSize(pageSize);
        pageUtil.setTotalCount(productorderMapper.getProductorderCount(status,productorderUserId));
        pageUtil.setList(productorderMapper.getOrderForPage(pageIndex,pageSize,status,productorderUserId));
        pageUtil.setPageIndex(pageIndex);
        return pageUtil;
    }


}
