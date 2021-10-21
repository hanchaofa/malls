package com.kgc.controller;

import com.kgc.pojo.Address;
import com.kgc.service.UserService;
import com.kgc.service.impl.AddressServiceImpl;
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
@RequestMapping("/User")
public class UserController {
    @Resource
    AddressServiceImpl addressService;
    @RequestMapping("/login")
    public String getlogin(){
        return "/page/fore/loginPage";
    }
    @RequestMapping("/register")
    public String getregister(Model model){
        List<Address> list = addressService.getSheng();
        List<Address> shi = addressService.getShi(110000);
        List<Address> qu = addressService.getQu(110100);
        model.addAttribute("addressList",list);
        model.addAttribute("cityList",shi);
        model.addAttribute("districtList",qu);
        return "/page/fore/register";
    }
    @GetMapping(value = "/address/{addressRegionId}",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Map<String,Object> getregisterByOtr(@PathVariable("addressRegionId")Integer addressRegionId){
        Map<String,Object> map=new HashMap<>();
        List<Address> shi = addressService.getShi(addressRegionId);
        List<Address> qu =addressService.getQu(addressRegionId);
        map.put("addressList",shi);
        map.put("childAddressList",qu);
        map.put("success","true");
        return map;
    }
}
