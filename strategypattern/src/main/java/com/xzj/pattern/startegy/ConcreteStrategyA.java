package com.xzj.pattern.startegy;

/**
 * 具体策略A
 */
public class ConcreteStrategyA extends Strategy{

    @Override
    public String algorithmInterface() {
        return "ConcreteStrategyA";
    }

    @Override
    public String mark() {
        return "ConcreteStrategyA";
    }
}
