package com.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    // wdsdads
    @RequestMapping("/login")
    public String getshiw(Model model){
        //vjhggjg
        System.out.println("testss");
        model.addAttribute("","");
        return "page/admin/loginPage";
    }
}
