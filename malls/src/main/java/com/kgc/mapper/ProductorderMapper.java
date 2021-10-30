package com.kgc.mapper;

import com.kgc.pojo.Product;
import com.kgc.pojo.Productorder;
import com.kgc.tool.PageUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ProductorderMapper {
    /**
     * 通过商品ID获取商品卖出量
     * @param ProductId
     * @return
     */
    Integer getNumber(Integer ProductId);
    /**
     * 根据订单的productId进行双表（Productorder与productorderitem）查询
     * @param productId
     * @return
     */
    Product getProductorder(Integer productId);
    /**
     * 个人订单分页，根据状态进行分页展示
     * @param pageIndex
     * @param pageSize
     * @param status
     * @return
     */
    List<Productorder> getOrderForPage(@Param("pageIndex") Integer pageIndex,
                                           @Param("pageSize") Integer pageSize, @Param("status")Integer status,
    @Param("productorderUserId")Integer productorderUserId);

    /**
     * 获取当前用户状态订单数量
     * @param status
     * @param productorderUserId
     * @return
     */
    Integer getProductorderCount(@Param("status")Integer status,
                                 @Param("productorderUserId")Integer productorderUserId);
}
