package com.aa03.design.test05;

import org.springframework.core.Ordered;

public interface AbstractChainHandler<T> extends Ordered {

    /**
     * 执行责任链逻辑
     */
    void handle(T requestParam);

    /**
     * 责任链组织标识
     * @return
     */
    String mark();

}
