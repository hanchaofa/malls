package com.kgc.service;

import com.kgc.pojo.Productimage;

import java.util.List;

/**
 * 商品图片表
 */
public interface ProductimageService {
    Integer AddImage(Productimage productimage);

    /**
     * 获取指定图片，通过商品的ID
     * @param productimageProductId
     * @return
     */
    List<Productimage> getPImage(Integer productimageProductId);
    /**
     * 获取全部图片，通过商品的ID
     * @param productimageProductId
     * @return
     */
    List<Productimage> getAllImg(Integer productimageProductId);

    /**
     * 获取指定图片，通过商品的ID
     * @param productimageProductId
     * @return
     */
    Productimage getOneImage(Integer productimageProductId);
}
