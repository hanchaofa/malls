package com.kgc.service;

import com.kgc.pojo.User;
import com.kgc.tool.PageUtil;

public interface UserService {
    /**
     * 用户分页列表展示
     * @param pageIndex
     * @param pageSize
     * @param userGender（用户性别）
     * @param userName（用户名称）
     * @return
     */
    PageUtil<User> getUserPage(Integer pageIndex,Integer pageSize,Integer userGender,String userName);

    /**
     * 查询个人详细信息，并且根据查询到的个人详细信息的用户ID查询购物车信息
     * （在订单表Mapper接口添加获取属于当前ID的订单集合）
     * @param userId
     * @return
     */
    User getUser(Integer userId);



}
