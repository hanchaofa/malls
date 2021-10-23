package com.kgc.controller;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.Product;
import com.kgc.service.impl.ProductorderServiceImpl;
import com.kgc.service.impl.ReviewServiceImpl;
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
    @Resource
    ProductorderServiceImpl productorderService;

    @Resource
    ReviewServiceImpl reviewService;
    @RequestMapping("/test")
    public String gettest(){
        return "/page/fore/register";
    }
    @RequestMapping("/getthings")
    public String AllProductList(Model model,String productName){
        List<Product> list = productMapper.getProduct(productName);
        for(int i=0;i<list.size();i++){
            list.get(i).setProductReviewCount(reviewService.getReiew(list.get(i).getProductId()));
            list.get(i).setProductSaleCount(productorderService.getNumber(list.get(i).getProductId()));
        }
        model.addAttribute("productList",list);
        return "/page/fore/productListPage";
    }

}
