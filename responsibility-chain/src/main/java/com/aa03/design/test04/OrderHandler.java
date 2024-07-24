package com.aa03.design.test04;

import org.springframework.core.Ordered;

/**
 * 定义排序责任链接口
 */
public interface OrderHandler<T> extends Ordered {

    public void handle(T requestParam);
}
