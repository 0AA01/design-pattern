package com.aa03.design.test05;

import org.springframework.stereotype.Component;

/**
 * 订单创建责任链实现
 */
@Component
public class OrderCreateParamNotNullChainHandler implements OrderCreateChainFilter{
    @Override
    public void handle(Object requestParam) {
        System.out.println("执行 OrderCreateParamNotNullChainHandler，执行顺序：" + getOrder());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
