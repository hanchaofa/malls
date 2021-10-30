package com.kgc.controller;

import com.kgc.pojo.*;
import com.kgc.service.impl.ProductServiceImpl;
import com.kgc.service.impl.ProductimageServiceImpl;
import com.kgc.service.impl.ProductorderServiceImpl;
import com.kgc.service.impl.ProductorderitemServiceImpl;
import com.kgc.tool.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Productorder")
public class ProductorderController {
    @Resource
    ProductorderServiceImpl productorderService;
    @Resource
    ProductimageServiceImpl productimageService;
    @Resource
    ProductorderitemServiceImpl productorderitemService;
    @Resource
    ProductServiceImpl productService;
    @RequestMapping("/create/{productId}")
    @ResponseBody
    public Map<String,Object> getCreateNew(@PathVariable("productId")Integer productId, Integer product_number
    , HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = (User)session.getAttribute("user");
        List<Productorderitem> productorderList = productorderitemService.getProductOrderitem(user.getUserId());
        Integer userid=user.getUserId();
        if(productorderList.size()>0){
            for(Productorderitem productorder:productorderList){
                if(productorder.getProductorderitemProductId().equals(productId)){
                    Integer i=productorderitemService.UpProductOrderitem(productId,userid,product_number);
                    if(i>0) {
                        map.put("success", true);
                        return map;
                    }
                }
            }
        }
        Product product = productService.getProductById(productId);
        Productorderitem productorderitem=new Productorderitem();
        productorderitem.setProductorderitemPrice(product.getProductSalePrice());
        productorderitem.setProductorderitemUserId(user.getUserId());
        productorderitem.setProductorderitemNumber(product_number);
        productorderitem.setProductorderitemProductId(productId);
        Integer integer = productorderitemService.AddProductOrderitem(productorderitem);
        if(integer>0){
            map.put("success",true);
        }
        return map;
    }
    @RequestMapping("/cart")
    public String getToCar(HttpSession session,Model model){
        User user = (User)session.getAttribute("user");
        if(user!=null){
            Integer orderItemTotal=0;
            List<Productorderitem> productorderList = productorderitemService.getProductOrderitem(user.getUserId());
            if(productorderList.size()>0){
                for(Productorderitem productorder:productorderList){
                    orderItemTotal+=productorder.getProductorderitemNumber();
                    Product product = productService.getProductById(productorder.getProductorderitemProductId());
                    productorder.setProductOrderItemProduct(product);
                    List<Productimage> pImage = productimageService.getPImage(productorder.getProductorderitemProductId());
                    product.setSingleProductImageList(pImage);
                    productorder.setProductOrderItemProduct(product);
                }
            }
            model.addAttribute("orderItemList",productorderList);
            model.addAttribute("orderItemTotal",orderItemTotal);
            return "/page/fore/productBuyCarPage";
        }else{
            return "redirect:/User/login";
        }

    }
    @RequestMapping(value = "/DelorderItem/{orderproduct}",produces = {"application/json;charset=utf-8"},
            method = RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> getDelorderItem(@PathVariable("orderproduct")Integer orderproduct,HttpSession session){
        User user = (User)session.getAttribute("user");
        Map<String,Object> map = new HashMap<>();
        if(user==null){
            map.put("success",false);
            map.put("href","/User/login");
            return map;
        }
        List<Productorderitem> productorderList = productorderitemService.getProductOrderitem(user.getUserId());
            for(Productorderitem productorderitem:productorderList){
                if(orderproduct.equals(productorderitem.getProductorderitemProductId())){
                    Integer integer = productorderitemService.DelProductOrder(orderproduct);
                    map.put("success",true);
                }
            }
        return map;
    }
    @RequestMapping("/order/{pageIndex}/{pageSize}")
    public String getOrder(@PathVariable("pageIndex")Integer pageIndex,@PathVariable("pageSize")Integer pageSize
    ,@RequestParam(value = "status",required = false) Integer status,Model model,HttpSession session){
        User user = (User)session.getAttribute("user");
        if(user!=null){
            PageUtil<Productorder> page = productorderService.getOrderForPage(pageIndex, pageSize, status, user.getUserId());
            List<Productorder> list = page.getList();
            for(int i=0;i<list.size();i++){
                List<Productorderitem> prodctOrderItemById = productorderitemService.getProdctOrderItemById(list.get(i).getProductorderId());
                list.get(i).setProductorderitems(prodctOrderItemById);
                for(Productorderitem productorderitem:list.get(i).getProductorderitems()){
                    list.get(i).setProductOrderItemProduct(productService.getProductById(productorderitem.getProductorderitemProductId()));
                    Product product = list.get(i).getProductOrderItemProduct();
                    product.setSingleProductImageList(productimageService.getPImage(list.get(i).getProductOrderItemProduct().getProductId()));
                }
            }
          /*  for(int i=0;i<list.size();i++){
                List<Productimage> image = ;
                list.get(i).getProductOrderItemProduct().setSingleProductImageList(image);
            }*/
            model.addAttribute("pageUtil",page);
            model.addAttribute("productOrderList",list);
            return "/page/fore/orderListPage";
        }else{
            return "redirect:/User/login";
        }



    }

}
