package com.kgc.service.fore;

import com.kgc.pojo.User;

/**
 * 用户业务（接口）
 */
public interface UserService {
    /**
     * 用户登录
     * @param userName 用户名
     * @param userPassword 密码
     * @return 登入系统的用户对象
     */
    User userLogin(String userName, String userPassword);

    /**
     * 用户注册
     * @param user 用户对象（前端封装表单数据）
     * @return 执行结果：是否成功
     */
    boolean register(User user);

    /**
     * 用户登出（注销）
     * @return 执行结果：是否成功
     */
    boolean logout();
}
