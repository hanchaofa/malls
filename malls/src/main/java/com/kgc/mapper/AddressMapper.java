package com.kgc.mapper;

import com.kgc.pojo.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressMapper {
    /**
     * 获取省份
     * @return
     */
    List<Address> getSheng();

    /**
     * 获取市级
     * @return
     */
    List<Address> getShi(@Param("addressRegionId") Integer addressRegionId);

    /**
     * 获取县区级
     * @return
     */
    List<Address> getQu(@Param("addressRegionId") Integer addressRegionId);
}
