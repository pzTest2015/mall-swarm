package com.jgj.portal.service;

import com.jgj.model.PmsProduct;
import com.jgj.portal.domain.PmsPortalProductDetail;
import com.jgj.portal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * 前台商品管理Service
 * Created by jgj on 2020/4/6.
 */
public interface PmsPortalProductService {
    /**
     * 综合搜索商品
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    PmsPortalProductDetail detail(Long id);
}
