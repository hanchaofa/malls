package com.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/login")
    public String getshiw(Model model){
        System.out.println("test wang");
        return "page/fore/orderListPage";
    }
}
