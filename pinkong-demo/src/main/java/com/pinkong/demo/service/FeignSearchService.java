package com.pinkong.demo.service;

import com.pinkong.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pinkong on 2019/10/22.
 */
@FeignClient("pinkong-search")
public interface FeignSearchService {

    @GetMapping("/esProduct/search/simple")
    CommonResult search(@RequestParam(required = false) String keyword,
                        @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                        @RequestParam(required = false, defaultValue = "5") Integer pageSize);
}
