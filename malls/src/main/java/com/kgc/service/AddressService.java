package com.kgc.service;

import com.kgc.pojo.Address;

import java.util.List;

public interface AddressService {
    /**
     * 获取省份
     * @return
     */
    List<Address> getSheng();

    /**
     * 获取市级
     * @return
     */
    List<Address> getShi(Integer addressRegionId);

    /**
     * 获取县区级
     * @return
     */
    List<Address> getQu(Integer addressRegionId);
}
