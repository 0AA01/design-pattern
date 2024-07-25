package com.aa03.design.test;

import com.aa03.design.test02.DiscountStrategy;
import com.aa03.design.test02.DiscountStrategyFactory;
import com.aa03.design.test03.AbstractExecuteStrategy;
import com.aa03.design.test03.AbstractStrategyChoose;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTest {

    @Autowired
    private DiscountStrategyFactory discountStrategyFactory;

    @Autowired
    private AbstractStrategyChoose abstractStrategyChoose;

    @Test
    public void test02() {
        DiscountStrategy discountStrategy = discountStrategyFactory.chooseStrategy("93");
        Double discount = discountStrategy.discount(100D);
        System.out.println(discount);
    }

    @Test
    public void test03() {
        AbstractExecuteStrategy<Double, Double> discountStrategy = abstractStrategyChoose.choose("93");
        Double discount = discountStrategy.executeResp(100D);
        System.out.println(discount);
    }
}
