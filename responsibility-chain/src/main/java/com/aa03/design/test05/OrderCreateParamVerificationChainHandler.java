package com.aa03.design.test05;

import org.springframework.stereotype.Component;

@Component
public class OrderCreateParamVerificationChainHandler  implements OrderCreateChainFilter{

    @Override
    public void handle(Object requestParam) {
        System.out.println("执行 OrderCreateParamVerificationChainHandler，执行顺序：" + getOrder());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
