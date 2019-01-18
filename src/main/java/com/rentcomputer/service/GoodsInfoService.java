package com.rentcomputer.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rentcomputer.dao.GoodsInfoMapper;
import com.rentcomputer.model.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.HashMap;
import java.util.Map;

/*
 * @Author hzj
 * @ClassName GoodsService
 * @Description 商品服务
 * @Date 15:45 2019/1/18
 * @Param 
 * @return 
 **/
@Service
public class GoodsInfoService {

    //注入商品mapper
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    /*
     * @Author hzj
     * @ClassName GoodsInfoService
     * @Description 多条件获取商品列表带分页
     * @Date 15:47 2019/1/18
     * @Param 
     * @return 
     **/
    public ListenableFuture<Map<String,Object>> selectGoodsInfoByParam(Map<String,Object> paramMap,
                                                                       Pagination pagination){
        PageHelper.startPage(pagination.getPage(), pagination.getRows());
        Page<Map<String,Object>> membersPage = (Page<Map<String,Object>>) goodsInfoMapper.selectGoodsInfoByParam(paramMap);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("total", membersPage.getTotal());
        resultMap.put("rows", membersPage.getResult());
        return new AsyncResult<>(resultMap);
    }
}
