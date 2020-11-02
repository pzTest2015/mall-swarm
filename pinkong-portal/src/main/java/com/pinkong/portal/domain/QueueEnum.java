package com.pinkong.portal.domain;

import lombok.Getter;

/**
 * 消息队列枚举配置
 * Created by pinkong on 2018/9/14.
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCEL("pinkong.order.direct", "pinkong.order.cancel", "pinkong.order.cancel"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("pinkong.order.direct.ttl", "pinkong.order.cancel.ttl", "pinkong.order.cancel.ttl");

    /**
     * 交换名称
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
