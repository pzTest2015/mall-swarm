package com.pinkong.demo.config;

import com.pinkong.common.config.BaseSwaggerConfig;
import com.pinkong.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by pinkong on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.pinkong.demo.controller")
                .title("pinkong-demo系统")
                .description("SpringCloud版本中的一些示例")
                .contactName("pinkong")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
