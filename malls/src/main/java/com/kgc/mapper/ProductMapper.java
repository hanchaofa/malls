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
}
