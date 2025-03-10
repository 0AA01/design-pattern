package com.xzj.pattern.simplefactory;

/**
 * 运算实现类 *
 */
public class Mul implements Operation {

    @Override
    public Integer getResult(Integer numberA, Integer numberB) {
        return numberA * numberB;
    }
}
