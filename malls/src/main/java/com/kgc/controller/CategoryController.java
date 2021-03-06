package com.kgc.controller;

import com.alibaba.fastjson.JSON;
import com.kgc.mapper.CategoryMapper;
import com.kgc.pojo.Category;
import com.kgc.pojo.Product;
import com.kgc.pojo.Productimage;
import com.kgc.service.CategoryService;
import com.kgc.service.ProductService;
import com.kgc.service.ProductimageService;
import com.kgc.service.impl.CategoryServiceImpl;
import com.kgc.service.impl.ProductServiceImpl;
import com.kgc.service.impl.ProductimageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Resource
    ProductimageServiceImpl productimageService;
    @RequestMapping("/getCategory")
    public String getCateoryAll(Model model){
        List<Category> list = categoryService.getCateoryList();
        List<Product> promotion = productService.getPromotion();
        for(int i=0;i<list.size();i++){
            List<Product> products = productService.getPageByCate(list.get(i).getCategoryId());
           for(int j=0;j<products.size();j++){
               List<Productimage> pImage = productimageService.getPImage(products.get(j).getProductId());
               products.get(j).setSingleProductImageList(pImage);
           }
            list.get(i).setProductList(products);
        }
        model.addAttribute("categoryList",list);
        model.addAttribute("specialProductList",promotion);
        return "/page/fore/homePage";
    }
    @GetMapping(value = "/nav/{toggle}",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String getNav(@PathVariable("toggle")Integer tog){
        List<Category> list = categoryService.getCateoryList();
        Map<String,Object> map=new HashMap<>();
        Category category=new Category();
       for(int i=0;i<list.size();i++){
            if(list.get(i).getCategoryId()==tog){
                list.get(i).setProductList(productService.getAllProduct(null,tog));
                category=list.get(i);
            }
       }
        map.put("category",category);
        map.put("success",true);
        return JSON.toJSONString(map);
    }
}
