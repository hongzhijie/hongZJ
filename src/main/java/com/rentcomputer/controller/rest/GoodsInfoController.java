package com.rentcomputer.controller.rest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rentcomputer.model.Pagination;
import com.rentcomputer.model.Param;
import com.rentcomputer.model.Result;
import com.rentcomputer.service.GoodsInfoService;
import com.rentcomputer.utils.Utils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author hzj
 * @ClassName GoodsInfoController
 * @Description 商品控制类
 * @Date 15:58 2019/1/18
 * @Param 
 * @return 
 **/
@RestController
@RequestMapping("ws/goods")
public class GoodsInfoController {

    //日志
    private Logger logger = Logger.getLogger(GoodsInfoController.class);

    //注入商品服务
    @Autowired
    private GoodsInfoService goodsInfoService;

    /**
     * 多条件获取商品列表带分页
     * @param request
     * @return
     */
    @RequestMapping("/getGoodsList")
    @ResponseBody
    public Result selectGoodsInfoByParam(HttpServletRequest request) {
        Result r = new Result(Result.RESULT_FAILURE, "系统繁忙!");
        try {
            Param param = (Param) request.getAttribute("param");
            JSONObject jobject = JSON.parseObject(param.getData().toString());
            String goodsName = null;
            if (!Utils.Str.isEmpty(jobject.getString("goodsName"))) {
                goodsName = jobject.getString("goodsName");
            }
            Integer pageNo = 1;
            Integer pageSize = 10;
            if (!Utils.Str.isEmpty(jobject.getString("pageNo"))) {
                pageNo = jobject.getInteger("pageNo");
            }
            if (!Utils.Str.isEmpty(jobject.getString("pageSize"))) {
                pageSize = jobject.getInteger("pageSize");
            }
            Pagination pagination = new Pagination();
            pagination.setPage(pageNo);
            pagination.setRows(pageSize);
            Map<String,Object> paramMap = new HashMap<>();
            paramMap.put("goodsName",goodsName);
            //.get()代表阻塞调用，.get(1, TimeUnit.SECONDS)代表限时调用
            Map<String,Object> returnMap = goodsInfoService.selectGoodsInfoByParam(paramMap,pagination).get();
            r.setTotal(((Long) returnMap.get("total")).intValue());
            r.setData(returnMap.get("rows"));
            r.setCode(Result.RESULT_SUCCESS);
            r.setMsg("获取数据成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
            return new Result(Result.RESULT_FAILURE, "系统异常，请联系网络管理员!");
        }
        return r;
    }
}
