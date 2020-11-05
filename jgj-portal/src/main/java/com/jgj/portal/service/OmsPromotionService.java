package com.jgj.portal.service;

import com.jgj.model.OmsCartItem;
import com.jgj.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * Created by jgj on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
