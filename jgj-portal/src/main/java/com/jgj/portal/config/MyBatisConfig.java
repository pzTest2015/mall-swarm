package com.jgj.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by jgj on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.jgj.mapper","com.jgj.portal.dao"})
public class MyBatisConfig {
}
