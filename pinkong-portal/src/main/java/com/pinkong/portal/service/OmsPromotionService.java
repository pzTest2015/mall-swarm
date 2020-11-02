package com.pinkong.portal.service;

import com.pinkong.model.OmsCartItem;
import com.pinkong.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * Created by pinkong on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
