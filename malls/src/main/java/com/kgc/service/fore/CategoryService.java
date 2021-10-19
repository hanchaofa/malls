package com.kgc.service.fore;

import com.kgc.pojo.Category;

import java.util.List;

/**
 * 分类业务（接口）
 */
public interface CategoryService {
    /**
     * 获取所有分类
     * @return 分类集合
     */
    List<Category> getCategoryList();
}
