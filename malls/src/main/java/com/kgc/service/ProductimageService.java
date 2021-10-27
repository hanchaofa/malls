package com.kgc.service;

import com.kgc.pojo.Productimage;

import java.util.List;

/**
 * 商品图片表
 */
public interface ProductimageService {
    Integer AddImage(Productimage productimage);

    /**
     * 获取图片，通过商品的ID
     * @param productimageProductId
     * @return
     */
    List<Productimage> getPImage(Integer productimageProductId);

}
