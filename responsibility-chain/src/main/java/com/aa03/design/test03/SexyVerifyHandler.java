package com.aa03.design.test03;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SexyVerifyHandler implements VerifyHandler { // 敏感信息验证

    @Override
    public List<Object> verify(List<Object> objList) {
        System.out.println("进行 SexyVerifyHandler 验证");
        List<Object> result = objList;
        return result;
    }
}
