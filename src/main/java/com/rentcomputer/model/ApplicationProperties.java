package com.rentcomputer.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
 * @Author hzj
 * @ClassName ApplicationProperties
 * @Description 获取配置文件信息
 * @Date 14:33 2019/1/14
 * @Param 
 * @return 
 **/

@Component
@Configuration
public class ApplicationProperties{

  @Value("${web_root}")
  private String webRoot;

  public String getWebRoot() {
    return webRoot;
  }

  public void setWebRoot(String webRoot) {
    this.webRoot = webRoot;
  }
}
