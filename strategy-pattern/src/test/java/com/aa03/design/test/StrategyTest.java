package com.aa03.design.test;

import com.aa03.design.test02.DiscountStrategy;
import com.aa03.design.test02.DiscountStrategyFactory;
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

    @Test
    public void test02() {
        DiscountStrategy discountStrategy = discountStrategyFactory.chooseStrategy("93");
        Double discount = discountStrategy.discount(100D);
        System.out.println(discount);
    }
}
