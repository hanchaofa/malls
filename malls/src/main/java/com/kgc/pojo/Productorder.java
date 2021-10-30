package com.kgc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Productorder {
    private Integer productorderId;
    private String productorderCode;
    private String productorderAddress;
    private String productorderDetailAddress;
    private String productorderPost;
    private String productorderReceiver;
    private String productorderMobile;
    private String productorderPayDate;
    private String productorderDeliveryDate;
    private String productorderConfirmDate;
    private Integer productorderStatus;
    private Integer productorderUserId;
    private Product productOrderItemProduct;
    private List<Productorderitem> productorderitems;
}
