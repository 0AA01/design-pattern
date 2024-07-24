package com.aa03.design.test05;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 责任链处理器
 */
@Component
public final class AbstractChainHandlerContext<T> implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    private Map<String, List<AbstractChainHandler>> abstractChainHandlerContainer = Maps.newHashMap();

    public void handle(String mark, T requestParam) {
        List<AbstractChainHandler> abstractChainHandlerList = abstractChainHandlerContainer.get(mark);
        if (CollectionUtils.isEmpty(abstractChainHandlerList)) return;
        abstractChainHandlerList
                .stream()
                .sorted(Comparator.comparing(Ordered::getOrder))
                .forEach(each -> each.handle(requestParam));
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, AbstractChainHandler> beansOfType = applicationContext.getBeansOfType(AbstractChainHandler.class);
        beansOfType.forEach((key, val) -> {
            List<AbstractChainHandler> abstractChainHandlers = abstractChainHandlerContainer.get(val.mark());
            if (abstractChainHandlers == null) {
                abstractChainHandlers = new ArrayList<>();
            }
            abstractChainHandlers.add(val);
            abstractChainHandlerContainer.put(val.mark(), abstractChainHandlers);
        });
    }
}
