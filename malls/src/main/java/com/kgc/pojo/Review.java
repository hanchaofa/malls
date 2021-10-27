package com.kgc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Review {
    private Integer reviewId;
    private String reviewContent;
    private String reviewCreatedate;
    private Integer reviewUserId;
    private Integer reviewProductId;
    private Integer reviewOrderItemId;
    private User reviewUser;
}
