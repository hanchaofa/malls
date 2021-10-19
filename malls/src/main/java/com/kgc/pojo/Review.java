package com.kgc.pojo;

import lombok.Data;

@Data
public class Review {
    private Integer reviewId;
    private String reviewContent;
    private String reviewCreatedate;
    private Integer reviewProductId;
    private Integer reviewOrderItemId;
    // 用户
    private User reviewUser;
}
