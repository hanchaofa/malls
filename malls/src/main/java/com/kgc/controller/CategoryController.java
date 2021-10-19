package com.kgc.controller;

import com.kgc.mapper.CategoryMapper;
import com.kgc.pojo.Category;
import com.kgc.service.CategoryService;
import com.kgc.service.impl.CategoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/Category")
public class CategoryController {
    @Resource
    CategoryServiceImpl categoryService;
    @RequestMapping("/getCategory")
    public String getCateoryAll(Model model){
        List<Category> list = categoryService.getCateoryList();
        model.addAttribute("categoryList",list);
        return "/page/fore/homePage";
    }
}
