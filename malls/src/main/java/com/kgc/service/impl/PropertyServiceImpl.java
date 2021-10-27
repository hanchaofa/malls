package com.kgc.service.impl;

import com.kgc.mapper.PropertyMapper;
import com.kgc.pojo.Property;
import com.kgc.service.PropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Resource
    PropertyMapper propertyMapper;
    @Override
    public List<Property> getProperty(Integer propertyCategoryId) {
        return null;
    }

    @Override
    public Integer AddProperty(Integer propertyCategoryId) {
        return null;
    }

    @Override
    public List<Property> getAllProperty(Integer propertyCategoryId) {
        return propertyMapper.getAllProperty(propertyCategoryId);
    }
}
