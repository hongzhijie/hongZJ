package com.rentcomputer.dao;


import com.rentcomputer.model.GoodsInfo;

/*
 * @Author hzj
 * @ClassName GoodsInfoMapper
 * @Description 商品实现mapper
 * @Date 15:42 2019/1/18
 * @Param 
 * @return 
 **/

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKeyWithBLOBs(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}