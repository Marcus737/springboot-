package com.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wei.dao")
@EnableTransactionManagement
@EnableCaching
public class JPAApplication {
    public static void main(String[] args) {
        SpringApplication.run(JPAApplication.class, args);
    }
}
