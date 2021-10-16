package com.kgc.service;

import com.kgc.mapper.AdminMapper;
import com.kgc.pojo.Admin;

import javax.annotation.Resource;

public class AdminServiceImpl  {
    @Resource
    AdminMapper adminMapper;



    public Admin getLogin(String adminName, String adminPassword) {
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        admin.setAdminPwd(adminPassword);
        // 调用dao层方法，根据用户名和密码获取用户对象
        Admin loginAdmin = adminMapper.getAdmin(admin);
        return loginAdmin;
    }
}
