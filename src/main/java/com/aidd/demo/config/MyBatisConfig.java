package com.aidd.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.aidd.demo.mapper")
public class MyBatisConfig {

}
