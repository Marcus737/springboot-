package com.wei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wei.mapper") //java类的扫描路径
public class MyBatisSpriingBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisSpriingBootApplication.class, args);
    }
}
