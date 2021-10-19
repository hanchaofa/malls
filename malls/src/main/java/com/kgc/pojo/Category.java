package com.kgc.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Category {
    private Integer categoryId;
    private String categoryName;
    private String categoryImageSrc;
    private List<Product> productList = new ArrayList<Product>();
}
