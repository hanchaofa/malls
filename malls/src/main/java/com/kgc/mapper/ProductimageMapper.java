package com.kgc.mapper;

import com.kgc.pojo.Productimage;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductimageMapper {
    /**
     * 获取图片通过商品的ID
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
