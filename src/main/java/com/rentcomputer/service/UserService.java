package com.rentcomputer.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rentcomputer.dao.UserMapper;
import com.rentcomputer.model.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/*
 * @Author hzj
 * @ClassName UserService
 * @Description 用户service
 * @Date 17:06 2019/1/14
 * @Param 
 * @return 
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /*
     * @Author hzj
     * @ClassName UserService
     * @Description //TODO 
     * @Date 17:06 2019/1/14
     * @Param 
     * @return 
     **/
    
    public Map<String,Object> getUserList(Map<String,Object> paramMap, Pagination pagination){
        PageHelper.startPage(pagination.getPage(), pagination.getRows());
        Page<Map<String,Object>> membersPage = (Page<Map<String,Object>>) userMapper.getUserList(paramMap);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("total", membersPage.getTotal());
        resultMap.put("rows", membersPage.getResult());
        return resultMap;
    }
}
