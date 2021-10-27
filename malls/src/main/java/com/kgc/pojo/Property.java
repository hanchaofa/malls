package com.kgc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Property {
    private Integer propertyId;
    private String propertyName;
    private Integer propertyCategoryId;
    private List<Propertyvalue> propertyValueList;
}
