package com.kgc.controller;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/Product")
public class ProductController {
    @Resource
    ProductMapper productMapper;
    @RequestMapping("/test")
    public String gettest(){
        return "/page/fore/homePage";
    }
    @RequestMapping("/getthings")
    public String AllProductList(Model model){
        List<Product> list = productMapper.getAllProduct();
        model.addAttribute("",list);
        return "/page/fore/homePage";
    }
}
