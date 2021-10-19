package com.kgc.mapper;

import com.kgc.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    /**
     * 根据查询条件获取单个管理员对象
     * @param admin 查询条件
     * @return 管理员对象
     */
    Admin getAdmin(Admin admin);
    Integer updateAdmin(Admin admin);
}
