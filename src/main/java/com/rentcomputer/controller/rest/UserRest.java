package com.rentcomputer.controller.rest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rentcomputer.model.Pagination;
import com.rentcomputer.model.Param;
import com.rentcomputer.model.Result;
import com.rentcomputer.service.UserService;
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
 * @ClassName UserRest
 * @Description 用户接口类
 * @Date 16:58 2019/1/14
 * @Param
 * @return
 **/
@RequestMapping("ws/user")
@RestController
public class UserRest {

    //日志
    private Logger logger = Logger.getLogger(UserRest.class);

    //用户服务
    @Autowired
    private UserService userService;

    /**
     * 获取用户列表带分页
     * @param request
     * @return
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public Result getUserList(HttpServletRequest request) {
        Result r = new Result(Result.RESULT_FAILURE, "系统繁忙!");
        try {
            Param param = (Param) request.getAttribute("param");
            JSONObject jobject = JSON.parseObject(param.getData().toString());
            String userName = null;
            if (!Utils.Str.isEmpty(jobject.getString("userName"))) {
                userName = jobject.getString("userName");
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
            paramMap.put("userName",userName);
            //.get()代表阻塞调用，.get(1, TimeUnit.SECONDS)代表限时调用
            Map<String,Object> returnMap = userService.getUserList(paramMap,pagination).get();
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
