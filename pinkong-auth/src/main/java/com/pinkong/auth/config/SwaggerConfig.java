package com.pinkong.auth.config;

import com.pinkong.common.config.BaseSwaggerConfig;
import com.pinkong.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by pinkong on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.pinkong.auth.controller")
                .title("pinkong认证中心")
                .description("pinkong认证中心相关接口文档")
                .contactName("pinkong")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
