package com.example.adminsystem.Config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

@Deprecated
//@Configuration
public class MyDataSourceConfig {

/*    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(){

        return new DruidDataSource();

    }
*/
}
