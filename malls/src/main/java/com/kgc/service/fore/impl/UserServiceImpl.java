package com.kgc.service.fore.impl;

import com.kgc.pojo.User;
import com.kgc.service.fore.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户业务（实现类）
 */
@Service
public class UserServiceImpl implements UserService {
    // 在此注入UserMapper

    @Override
    public User userLogin(String userName, String userPassword) {
        // 根据用户名和密码查询用户，调用数据访问层方法

        // 把用户对象（返回值）放入会话对象

        return null;
    }

    @Override
    public boolean register(User user) {
        // 新增用户，调用数据访问层方法

        // 自动登录，调用业务层方法

        return false;
    }

    @Override
    public boolean logout() {
        // 把用户对象（返回值）从会话对象中移除

        return false;
    }
}
