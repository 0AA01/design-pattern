package com.aa03.design.test;

import com.aa03.design.test03.VerifyHandlerChain;
import com.aa03.design.test04.OrderHandlerChainContext;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainApplicationTests {

    @Autowired
    private VerifyHandlerChain verifyHandlerChain;

    @Autowired
    private OrderHandlerChainContext<List<String>> orderHandlerChainContext;

    @Test
    public void contextLoads() {
        List<Object> verityList = new ArrayList<>(Lists.newArrayList("aa", "bb", "cc"));
        System.out.println("验证之前所有数据：" + verityList);
        verityList = verifyHandlerChain.verify(verityList);
        System.out.println("验证之后合法数据：" + verityList);
    }

    @Test
    public void orderedHandlerChain() {
        List<String> verityList = new ArrayList<>(Lists.newArrayList("aa", "bb", "cc"));

        orderHandlerChainContext.handle(verityList);
    }
}