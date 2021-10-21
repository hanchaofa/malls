package com.kgc.service.impl;

import com.kgc.mapper.UserMapper;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.tool.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public PageUtil<User> getUserPage(Integer pageIndex, Integer pageSize, Integer userGender, String userName) {
        return null;
    }

    @Override
    public User getUser(Integer userId, String userName, String userPassword) {
        return userMapper.getUser(userId,userName,userPassword);
    }

    @Override
    public Integer getAddUser(User user) {
        return userMapper.getAddUser(user);
    }
}
