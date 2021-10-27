package com.kgc.controller;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.*;
import com.kgc.service.impl.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Product")
public class ProductController {
    @Resource
    ProductimageServiceImpl productimageService;
    @Resource
    ProductMapper productMapper;
    @Resource
    ProductServiceImpl productService;
    @Resource
    ProductorderServiceImpl productorderService;
    @Resource
    ReviewServiceImpl reviewService;
    @Resource
    PropertyServiceImpl propertyService;
    @Resource
    PropertyvalueServiceImpl propertyvalueService;
    @Resource
    UserServiceImpl userService;
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
            list.get(i).setSingleProductImageList(productimageService.getAllImg(list.get(i).getProductId()));
        }
        model.addAttribute("productList",list);
        return "/page/fore/productListPage";
    }
    @RequestMapping("/getProduct/{productId}")
    public String getProductThing(@PathVariable("productId")Integer productId,Model model){
        Product product = productService.getProductById(productId);
        product.setProductReviewCount(reviewService.getReiew(productId));
        product.setProductSaleCount(productorderService.getNumber(productId));
        //获取一张类型图片
      /*  List<Productimage> pImage = productimageService.getPImage(productId);
        for(int s=0;s<pImage.size();s++){
            product.getProductCategory().setCategoryImageSrc(pImage.get(s).getProductimageSrc());
        }*/
        //根据商品类型，获取商品属性值集合
        List<Property> propertyList = propertyService.getAllProperty(product.getProductCategoryId());
        //根据商品ID获取，商品图片
        List<Productimage> list = productimageService.getAllImg(product.getProductId());
        List<Propertyvalue> propertyvalueList = propertyvalueService.getAllValue(product.getProductId());
        for(Property property:propertyList){
            List<Propertyvalue> list1=new ArrayList<>();
                for(Propertyvalue propertyvalue:propertyvalueList){
                    if(property.getPropertyId()==propertyvalue.getPropertyValuePropertyId()){
                        list1.add(propertyvalue);
                        property.setPropertyValueList(list1);
                    }
                }
        }

        product.setSingleProductImageList(list);
        List<Review> reivewById = reviewService.getReivewById(product.getProductId());
        for(int p=0;p<reivewById.size();p++){
            reivewById.get(p).setReviewUser(userService.getUser(reivewById.get(p).getReviewUserId(),null,null));
        }
        product.setReviewList(reivewById);
        model.addAttribute("product",product);
        model.addAttribute("propertyList",propertyList);
        model.addAttribute("loveProductList");
        return "/page/fore/productDetailsPage";
    }

}
