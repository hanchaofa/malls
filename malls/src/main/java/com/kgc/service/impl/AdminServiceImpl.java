package com.kgc.service.impl;

import com.kgc.mapper.AdminMapper;
import com.kgc.pojo.Admin;
import com.kgc.service.AdminService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Mapper
    AdminMapper adminMapper;
    @Override
    public Admin getLogin(String adminName, String adminPassword) {
        Admin admin=new Admin();
        admin.setAdminName(adminName);
        admin.setAdminPassword(adminPassword);
        return adminMapper.getAdmin(admin);
    }

    @Override
    public Integer updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }
}
