package com.kgc.controller;

import com.kgc.pojo.Address;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.service.impl.AddressServiceImpl;
import com.kgc.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {
    @Resource
    AddressServiceImpl addressService;
    @Resource
    UserServiceImpl userService;
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
        List<Address> qu =addressService.getQu(Integer.parseInt(shi.get(0).getAddressAreaId()));
        map.put("addressList",shi);
        map.put("childAddressList",qu);
        map.put("success","true");
        return map;
    }
    @PostMapping(value = "/doRegister",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Map<String,Object> getToUser(User user){
        Map<String,Object> map = new HashMap<>();
        Integer user1 = userService.getAddUser(user);
        if(user1>0){
            map.put("success","true");
        }else{
            map.put("success","false");
        }
        return map;
    }
    @PostMapping(value = "/doLogin",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String getDoLogin(String username, String password, HttpSession session){
        User user = userService.getUser(null, username, password);
        session.setAttribute("user",user);
        if(user!=null){
            return "true";
        }else{
            return "false";
        }
    }
    @PostMapping("/doLogin2")
    @ResponseBody
    public Map<String,Object> getToLogin(String username, String password, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = userService.getUser(null, username, password);
        session.setAttribute("user",user);
        if(user!=null){
            map.put("success",true);
        }else{
            map.put("success",false);
        }
        return map;
    }
    @RequestMapping("/homePage")
    public String getHomePage(){
        return "/page/fore/homePage";
    }
    @RequestMapping("/userDetails")
    public String userDetails(HttpSession session,Model model){
        User user=(User)session.getAttribute("user");
        if(user!=null){
            String userAddress = user.getUserAddress().substring(0,2);
            String userAddress2=user.getUserAddress().substring(0,4);
            System.out.println(userAddress);
            String subStrings="0000";
            List<Address> list = addressService.getSheng();
            System.out.println(userAddress+subStrings);
            List<Address> shi = addressService.getShi(Integer.parseInt(userAddress+subStrings));
            List<Address> qu = addressService.getQu(Integer.parseInt(shi.get(0).getAddressAreaId()));
            model.addAttribute("districtAddressId",user.getUserAddress());
            model.addAttribute("addressId",Integer.parseInt(userAddress+subStrings));
            model.addAttribute("cityAddressId",Integer.parseInt(userAddress2+"00"));
            model.addAttribute("districtAddressId",user.getUserAddress());
            model.addAttribute("addressList",list);
            model.addAttribute("cityList",shi);
            model.addAttribute("districtList",qu);
            model.addAttribute("user",user);
            return "/page/fore/userDetails";
        }else{
            return "/page/fore/loginPage";
        }
    }
    @RequestMapping("/logout")
    public String getLogout(HttpSession session){
        session.removeAttribute("user");
        return "/page/fore/loginPage";
    }
}
