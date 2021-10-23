package com.kgc.service.impl;

import com.kgc.mapper.CategoryMapper;
import com.kgc.pojo.Category;
import com.kgc.service.CategoryService;
import com.kgc.tool.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    CategoryMapper categoryMapper;
    @Override
    public List<Category> getCateoryList() {
        return categoryMapper.getCateoryList();
    }

    @Override
    public Integer getAddCateory(Category category) {
        return null;
    }

    @Override
    public PageUtil<Category> getCateoryPage(Integer pageIndex, Integer pageSize, String categoryName) {
        return null;
    }

    @Override
    public Integer updateCateory(Category category) {
        return null;
    }

    @Override
    public Category getCatList(Integer categoryId) {
        return categoryMapper.getCatList(categoryId);
    }
}
