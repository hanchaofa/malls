package com.kgc.service.impl;

import com.kgc.mapper.AddressMapper;
import com.kgc.pojo.Address;
import com.kgc.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressMapper addressMapper;

    @Override
    public List<Address> getSheng() {
        return addressMapper.getSheng();
    }

    @Override
    public List<Address> getShi(Integer addressRegionId) {
        return addressMapper.getShi(addressRegionId);
    }

    @Override
    public List<Address> getQu(Integer addressRegionId) {
        return addressMapper.getQu(addressRegionId);
    }
}
