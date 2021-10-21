package com.kgc.controller;

import com.kgc.mapper.CategoryMapper;
import com.kgc.pojo.Category;
import com.kgc.pojo.Product;
import com.kgc.service.CategoryService;
import com.kgc.service.ProductService;
import com.kgc.service.impl.CategoryServiceImpl;
import com.kgc.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Category")
public class CategoryController {
    @Resource
    CategoryServiceImpl categoryService;
    @Resource
    ProductServiceImpl productService;
    @RequestMapping("/getCategory")
    public String getCateoryAll(Model model){
        List<Category> list = categoryService.getCateoryList();
        List<Product> promotion = productService.getPromotion();
        model.addAttribute("categoryList",list);
        model.addAttribute("specialProductList",promotion);
        return "/page/fore/homePage";
    }
    @RequestMapping("/nav/{toggle}")
    @ResponseBody
    public Map<String,Object> getNav(@PathVariable("toggle")Integer tog){
        Map<String,Object> map=new HashMap<>();

        return map;
    }
}
