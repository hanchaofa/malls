package com.kgc.service;

import com.kgc.pojo.Productimage;

import java.util.List;

/**
 * 商品图片表
 */
public interface ProductimageService {
    Integer AddImage(Productimage productimage);

    /**
     * 获取当前商品ID下的所有信息
     * @param productimageProductId
     * @return
     */
    List<Productimage> getAllImg(Integer productimageProductId);
}
