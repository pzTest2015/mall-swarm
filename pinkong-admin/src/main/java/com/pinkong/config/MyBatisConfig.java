package com.pinkong.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by pinkong on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.pinkong.mapper","com.pinkong.dao"})
public class MyBatisConfig {
}
