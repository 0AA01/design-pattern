package com.aa03.design.test05;

/**
 * 订单创建责任链过滤器
 * 作用：
 *  防止太多责任链直接实现父类abstractChainHandler，造成实现类混乱
 *  相同一类的责任链子类的mark方法返回值相同，可以直接默认实现
 */
public interface OrderCreateChainFilter<T> extends AbstractChainHandler {

    @Override
    default String mark() {
        return "create";
    }
}
