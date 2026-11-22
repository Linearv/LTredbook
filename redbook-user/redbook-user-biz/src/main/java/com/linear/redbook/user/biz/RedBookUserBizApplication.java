package com.linear.redbook.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.linear.redbook.user.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.linear.redbook")
@ComponentScan({"com.linear.redbook.user.biz", "com.linear.redbook.count"}) //  多模块扫描
@SpringBootApplication
public class RedBookUserBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedBookUserBizApplication.class, args);
    }

}
