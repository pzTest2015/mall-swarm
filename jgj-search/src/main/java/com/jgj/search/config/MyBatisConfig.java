package com.jgj.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by jgj on 2019/4/8.
 */
@Configuration
@MapperScan({"com.jgj.mapper","com.jgj.search.dao"})
public class MyBatisConfig {
}
