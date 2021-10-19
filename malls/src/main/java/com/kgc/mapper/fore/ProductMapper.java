package com.kgc.mapper.fore;

import com.kgc.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * 查询6条促销商品信息
     * @return 商品集合
     */
    List<Product> getPromotingProductList();
}
