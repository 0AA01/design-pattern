package com.aa03.design.test03;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class VerifyHandlerChain implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    public final List<VerifyHandler> verifyHandlerList = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, VerifyHandler> beansOfType = applicationContext.getBeansOfType(VerifyHandler.class);
        beansOfType.forEach((key, val) -> verifyHandlerList.add(val));
    }

    public List<Object> verify(List<Object> objectList) {
        List<Object> resultList = objectList;
        for (VerifyHandler each : verifyHandlerList) {
            resultList = each.verify(resultList);
            if (CollectionUtils.isEmpty(resultList)) {
                return resultList;
            }
        }
        return resultList;
    }
}
