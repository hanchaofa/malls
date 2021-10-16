package com.kgc.service;

import com.kgc.pojo.Admin;

public interface AdminService {
    /**
     *  登录方法
     * @param adminName(管理员名称)
     * @param adminPassword(管理员的密码)
     * @return 管理员对象
     */
    Admin getLogin(String adminName,String adminPassword);

    /**
     * 修改管理人信息
     * @param admin
     * @return integer
     *
     */
    Integer updateAdmin(Admin admin);

}
