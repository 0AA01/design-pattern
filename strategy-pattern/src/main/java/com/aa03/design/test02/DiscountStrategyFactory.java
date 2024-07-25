package com.aa03.design.test02;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DiscountStrategyFactory implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    private final Map<String, DiscountStrategy> discountStrategies = new HashMap<>();

    public DiscountStrategy chooseStrategy(String type) {
        return discountStrategies.get(type);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, DiscountStrategy> beansOfType = applicationContext.getBeansOfType(DiscountStrategy.class);
        beansOfType.forEach((key, val) -> discountStrategies.put(val.mark(), val));
    }
}