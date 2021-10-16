package com.kgc.service;

import com.kgc.mapper.AdminMapper;
import com.kgc.pojo.Admin;

import javax.annotation.Resource;

public class AdminServiceImpl  {
    @Resource
    AdminMapper adminMapper;



    public Admin getLogin(String adminName, String adminPassword) {
       return null;
    }
}
