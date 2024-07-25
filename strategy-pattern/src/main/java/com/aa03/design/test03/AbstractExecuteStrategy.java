package com.aa03.design.test03;

/**
 * 策略执行抽象
 */
public interface AbstractExecuteStrategy<REQUEST, RESPONSE> {

    String mark();

    default void execute(REQUEST requestParam) {}

    default RESPONSE executeResp(REQUEST requestParam) {
        return null;
    }
}
