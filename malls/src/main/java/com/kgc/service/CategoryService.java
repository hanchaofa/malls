package com.kgc.service;

import com.kgc.pojo.Category;
import com.kgc.tool.PageUtil;

import java.util.List;

public interface CategoryService {
    /**
     * 获取商品列表
     * @return 返回商品类型列表
     */
    List<Category> getCateoryList();

    /**
     * 新增商品类型
     * @param category
     * @return Integer
     */
    Integer getAddCateory(Category category);

    /**
     *  类型分页
     * @param pageIndex
     * @param pageSize
     * @param categoryName(类型名称)
     * @return
     */
    PageUtil<Category> getCateoryPage(Integer pageIndex,Integer pageSize,String categoryName);

    Integer updateCateory(Category category);

    /**
     * 根据分类找分类的类型集合
     * @param categoryId
     * @return
     */
    Category getCatList(Integer categoryId);

}
