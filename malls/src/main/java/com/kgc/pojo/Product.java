package com.kgc.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private String productTitle;
    private Float productPrice;
    private Float productSalePrice;
    private Integer productCreateDate;
    private Integer productIsEnabled;
    // 分类
    private Category productCategory;
    // 预览图片列表
    private List<Productimage> singleProductImageList = new ArrayList<Productimage>();
    // 详情图片列表
    private List<Productimage> detailProductImageList = new ArrayList<Productimage>();
    // 总销量
    private Integer productSaleCount;
    // 总评论量
    private Integer productReviewCount;
    // 评论列表
    private List<Review> reviewList = new ArrayList<Review>();
}
