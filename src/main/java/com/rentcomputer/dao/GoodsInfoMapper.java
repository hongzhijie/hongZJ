package com.rentcomputer.dao;


import com.github.pagehelper.Page;
import com.rentcomputer.model.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/*
 * @Author hzj
 * @ClassName GoodsInfoMapper
 * @Description 商品实现mapper
 * @Date 15:42 2019/1/18
 * @Param 
 * @return 
 **/
@Mapper
public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKeyWithBLOBs(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    /*
     * @Author hzj
     * @ClassName GoodsInfoMapper
     * @Description 多条件获取商品列表带分页
     * @Date 15:49 2019/1/18
     * @Param 
     * @return 
     **/
    public Page<Map<String,Object>> selectGoodsInfoByParam(Map<String,Object> paramMap);
}