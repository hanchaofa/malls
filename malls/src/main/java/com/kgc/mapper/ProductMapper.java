package com.kgc.mapper;

import com.kgc.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
        List<Product> getAllProduct();
}
