package com.rentcomputer.dao;

/*
 * @Author hzj
 * @ClassName UserMapper
 * @Description //TODO 
 * @Date 17:09 2019/1/14
 * @Param 
 * @return 
 **/

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {

    public Page<Map<String,Object>> getUserList(Map<String, Object> paramMap);
}
