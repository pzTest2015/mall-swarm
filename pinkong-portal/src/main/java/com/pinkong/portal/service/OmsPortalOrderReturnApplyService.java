package com.pinkong.portal.service;

import com.pinkong.portal.domain.OmsOrderReturnApplyParam;

/**
 * 订单退货管理Service
 * Created by pinkong on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
