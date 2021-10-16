package com.kgc.pojo;

import lombok.Data;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private String productTitle;
    private Float productPrice;
    private Float productSalePrice;
    private Integer productCreateDate;
    private Integer productCategoryId;
    private Integer productIsEnabled;
}
