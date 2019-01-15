package com.rentcomputer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/*
 * @Author hzj
 * @ClassName RentcomputerApplication
 * @Description 启动类
 * @Date 20:17 2019/1/14
 * @Param 
 * @return 
 **/

@SpringBootApplication
//启用线程池
@EnableAsync
//启用缓存
@EnableCaching
public class RentcomputerApplication {

	public static void main(String[] args) {
        System.out.println("正在启动boot-------");
		SpringApplication.run(RentcomputerApplication.class, args);
	}

}

