package com.kgc.mapper;

import com.kgc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    Integer getAddUser(User user);
    User getUser(@Param("userId") Integer userId,@Param("userName") String userName, @Param("userPassword")String userPassword);
}
