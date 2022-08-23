package com.wei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class C3P0DatasourceConfig {

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource(){
        return DataSourceBuilder.create()
                .type(com.mchange.v2.c3p0.ComboPooledDataSource.class)
                .build();
    }
}
