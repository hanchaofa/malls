package com.kgc.mapper;

import com.kgc.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> getCateoryList();
    /**
     * 根据分类找分类的类型集合
     * @param categoryId
     * @return
     */
    Category getCatList(Integer categoryId);
}
