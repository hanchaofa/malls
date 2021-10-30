package com.kgc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Productorderitem {
    private Integer productorderitemId;
    private Integer productorderitemNumber;
    private float productorderitemPrice;
    private Integer productorderitemProductId;
    private Integer productorderitemOrderId;
    private Integer productorderitemUserId;
    private String productorderitemUserMessage;
    private Product productOrderItemProduct;
    private Boolean isReview;
}
