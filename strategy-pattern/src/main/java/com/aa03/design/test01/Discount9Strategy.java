package com.aa03.design.test01;

public class Discount9Strategy implements DiscountStrategy{
    @Override
    public Double discount(Double price) {
        return price * 0.9;
    }
}
