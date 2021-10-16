package com.kgc.pojo;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String userNickName;
    private String userPassword;
    private String userRealname;
    private Integer userGender;
    private String userBirthday;
    private String userAddress;
    private String userHomePlace;
    private String userProfilePictureSrc;
}
