package com.pinkong.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by pinkong on 2019/4/8.
 */
@Configuration
@MapperScan("com.pinkong.mall.mapper")
public class MyBatisConfig {
}
