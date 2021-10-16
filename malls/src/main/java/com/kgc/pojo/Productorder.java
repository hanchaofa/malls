package com.kgc.pojo;

import lombok.Data;

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
}
