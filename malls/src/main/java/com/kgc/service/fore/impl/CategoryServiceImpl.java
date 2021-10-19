package com.kgc.service.fore.impl;

import com.kgc.mapper.fore.CategoryMapper;
import com.kgc.pojo.Category;
import com.kgc.service.fore.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分类业务（实现类）
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }
}
