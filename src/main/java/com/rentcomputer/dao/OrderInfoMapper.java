package com.rentcomputer.dao;


import com.rentcomputer.model.OrderInfo;

/*
 * @Author hzj
 * @ClassName OrderInfoMapper
 * @Description 订单实现mapper
 * @Date 15:41 2019/1/18
 * @Param 
 * @return 
 **/

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}