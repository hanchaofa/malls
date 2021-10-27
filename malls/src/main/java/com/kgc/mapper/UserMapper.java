package com.kgc.mapper;

import com.kgc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户ID，获取评论人的名字
     * @param userId
     * @return
     */
    List<User> getRewiwById(Integer userId);
    Integer getAddUser(User user);
    User getUser(@Param("userId") Integer userId,@Param("userName") String userName, @Param("userPassword")String userPassword);
}
