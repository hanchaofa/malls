package com.kgc.controller.fore;

import com.kgc.service.fore.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProductDetailController {
    @Resource
    ProductService productService;

    @RequestMapping("/product/{productId}")
    public String getProductDetail(@PathVariable("productId") Integer productId,
                                   Model model) {
        // 商品详情
        model.addAttribute("product", productService.getProductDetail(productId));
        // 产品参数
        model.addAttribute("propertyList", productService.getPropertyList(productId));
        return "page/fore/productDetailsPage";
    }
}
