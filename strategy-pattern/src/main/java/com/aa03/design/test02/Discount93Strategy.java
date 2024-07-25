package com.aa03.design.test02;

import org.springframework.stereotype.Component;

@Component
public class Discount93Strategy implements DiscountStrategy {
    @Override
    public Double discount(Double price) {
        return price * 0.93;
    }

    @Override
    public String mark() {
        return "93";
    }
}
