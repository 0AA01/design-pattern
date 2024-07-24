package com.aa03.design.test04;

import org.springframework.stereotype.Component;

@Component
public class OrderVerifyHandler implements OrderHandler<Object> {
    @Override
    public void handle(Object requestParam) {
        System.out.println("执行 OrderVerifyHandler 顺序：" + this.getOrder());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
