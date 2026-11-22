package com.linear.redbook.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.linear.redbook.data.align.domain.mapper")
public class RedbookDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedbookDataAlignApplication.class, args);
    }

}

