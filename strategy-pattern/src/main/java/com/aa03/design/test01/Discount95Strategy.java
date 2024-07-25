package com.aa03.design.test01;

public class Discount95Strategy implements DiscountStrategy{
    @Override
    public Double discount(Double price) {
        return price * 0.95;
    }
}
