package com.pinkong.portal.service;

import com.pinkong.common.api.CommonPage;
import com.pinkong.model.PmsBrand;
import com.pinkong.model.PmsProduct;

import java.util.List;

/**
 * 前台品牌管理Service
 * Created by pinkong on 2020/5/15.
 */
public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
