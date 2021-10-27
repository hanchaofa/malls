package com.kgc.service.impl;

import com.kgc.mapper.PropertyvalueMapper;
import com.kgc.pojo.Propertyvalue;
import com.kgc.service.PropertyvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PropertyvalueServiceImpl implements PropertyvalueService {
    @Resource
    PropertyvalueMapper propertyvalueMapper;
    @Override
    public List<Propertyvalue> getAllValue(Integer propertyValueProductId) {
        return propertyvalueMapper.getAllValue(propertyValueProductId);
    }
}
