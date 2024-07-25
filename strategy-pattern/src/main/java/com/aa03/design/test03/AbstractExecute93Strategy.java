package com.aa03.design.test03;

import org.springframework.stereotype.Component;

@Component
public class AbstractExecute93Strategy implements AbstractExecuteStrategy<Double, Double>  {
    @Override
    public String mark() {
        return "93";
    }

    @Override
    public Double executeResp(Double requestParam) {
        return requestParam * 0.93;
    }
}
