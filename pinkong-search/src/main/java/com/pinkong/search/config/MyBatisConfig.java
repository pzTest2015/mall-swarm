package com.pinkong.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by pinkong on 2019/4/8.
 */
@Configuration
@MapperScan({"com.pinkong.mapper","com.pinkong.search.dao"})
public class MyBatisConfig {
}
