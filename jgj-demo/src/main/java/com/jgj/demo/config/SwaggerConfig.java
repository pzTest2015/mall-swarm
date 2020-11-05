package com.jgj.demo.config;

import com.jgj.common.config.BaseSwaggerConfig;
import com.jgj.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by jgj on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.jgj.demo.controller")
                .title("jgj-demo系统")
                .description("SpringCloud版本中的一些示例")
                .contactName("jgj")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
