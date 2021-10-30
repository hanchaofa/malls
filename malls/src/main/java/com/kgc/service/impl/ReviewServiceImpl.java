package com.kgc.service.impl;

import com.kgc.mapper.ReviewMapper;
import com.kgc.pojo.Review;
import com.kgc.service.ReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Resource
    ReviewMapper reviewMapper;
    @Override
    public Integer getReiew(Integer ProductId) {
        return reviewMapper.getReiew(ProductId);
    }

    @Override
    public List<Review> getReivewById(Integer reviewProductId) {
        return reviewMapper.getReivewById(reviewProductId);
    }

    @Override
    public Boolean isReivew(Integer reviewOrderItemId) {
        Integer reivew = reviewMapper.isReivew(reviewOrderItemId);
        if(reivew>0){
            return false;
        }else{
            return true;
        }

    }


}
