package com.linear.redbook.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@MapperScan("com.linear.redbook.comment.biz.domain.mapper")
@EnableRetry
@EnableFeignClients(basePackages = "com.linear.redbook")
public class RedbookCommentBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedbookCommentBizApplication.class, args);
    }

}

