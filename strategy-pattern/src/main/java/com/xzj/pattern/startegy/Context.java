package com.xzj.pattern.startegy;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 */
public class Context {

    private static Map<String, Strategy> strategyMap = new HashMap<String, Strategy>();

    public Context() {
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        strategyMap.put(strategyA.mark(), strategyA);
        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        strategyMap.put(strategyB.mark(), strategyB);
    }

    public String getResult(String mark) {
        return strategyMap.get(mark).algorithmInterface();
    }
}
