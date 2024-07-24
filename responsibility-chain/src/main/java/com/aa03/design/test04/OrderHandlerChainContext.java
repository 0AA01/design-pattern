package com.aa03.design.test04;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Component
public final class OrderHandlerChainContext<T> implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    private final List<OrderHandler> orderHandlerList = new ArrayList<>();

    public void handle(T requestParam) {
        orderHandlerList.stream()
                .sorted(Comparator.comparing(Ordered::getOrder))
                .forEach(each -> each.handle(requestParam));
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, OrderHandler> beansOfType = applicationContext.getBeansOfType(OrderHandler.class);
        beansOfType.forEach((key, val) -> orderHandlerList.add(val));
    }
}
