package com.kgc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private String productTitle;
    private float productPrice;
    private float productSalePrice;
    private String productCreateDate;
    private Integer productCategoryId;
    private Integer productIsEnabled;
    private List<Productimage> singleProductImageList;
    private Category productCategory;
    private String productSrc;
    private Integer productSaleCount;
    private Integer productReviewCount;
    private List<Review> reviewList;
    private List<Productimage> detailProductImageList;
}
