package com.pinkong.demo.controller;

import com.pinkong.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Nacos服务相关功能
 */
@Controller
@Api(tags = "TestNacosController", description = "Nacos服务相关功能")
@RequestMapping("/nacos")
@RefreshScope
public class TestNacosController {

    @Value("${server.port}")
    private String port;
    @Value("${server.paramtest}")
    private String paramtest;
    @ApiOperation("test")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> test() {
        return CommonResult.success(port);
    }

    @ApiOperation("paramtest")
    @RequestMapping(value = "/paramtest", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> paramtest() {
        return CommonResult.success(port+paramtest);
    }
}
