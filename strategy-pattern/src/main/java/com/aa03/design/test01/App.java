package com.aa03.design.test01;

public class App {
    public static void main(String[] args) {

        DiscountStrategy discountStrategy = DiscountStrategyFactory.chooseStrategy("2");

        Double discount = discountStrategy.discount(10D);

        System.out.println(discount);
    }
}
