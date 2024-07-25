package com.aa03.design.test01;

import java.io.Serializable;

/**
 * 建造者模式接口定义
 *
 * @param <T>
 */
public interface Builder<T> extends Serializable {

    T username(String username);

    T password(String password);

    /**
     * 构建
     */
    User build();
}
