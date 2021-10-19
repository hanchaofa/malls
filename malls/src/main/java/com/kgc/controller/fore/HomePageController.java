package com.kgc.controller.fore;

import com.kgc.service.fore.impl.CategoryServiceImpl;
import com.kgc.service.fore.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 前台首页控制器
 */
@Controller
public class HomePageController {
    @Resource
    CategoryServiceImpl categoryService;

    @Resource
    ProductServiceImpl productService;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("categoryList", categoryService.getCategoryList());
        model.addAttribute("specialProductList", productService.getPromotingProductList());
        return "page/fore/homePage";
    }
}
