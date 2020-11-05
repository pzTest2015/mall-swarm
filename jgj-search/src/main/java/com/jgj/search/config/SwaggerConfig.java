package com.jgj.search.config;

import com.jgj.common.config.BaseSwaggerConfig;
import com.jgj.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by jgj on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.jgj.search.controller")
                .title("jgj搜索系统")
                .description("jgj搜索相关接口文档")
                .contactName("jgj")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
