package com.kgc.controller;

import com.kgc.pojo.Admin;
import com.kgc.service.impl.AdminServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    AdminServiceImpl adminService;
    @RequestMapping("/getTologin")
    public String getToLogin(){
        return "/page/admin/loginPage";
    }
    @RequestMapping(value = "/login",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Admin getLogin(String username, String password, HttpSession session){
        Admin login = adminService.getLogin(username, password);
        session.setAttribute("admin",login);
        return login;
    }
}
