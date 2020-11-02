package com.pinkong.common.api;

/**
 * 封装API的错误码
 * Created by pinkong on 2019/4/19.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
