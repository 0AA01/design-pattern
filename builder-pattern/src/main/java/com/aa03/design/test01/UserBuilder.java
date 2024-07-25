package com.aa03.design.test01;


import cn.hutool.core.util.StrUtil;

public class UserBuilder implements Builder<UserBuilder> {
    private User user = new User();

    private UserBuilder() {
    }

    public static UserBuilder create() {
        return new UserBuilder();
    }

    @Override
    public User build() {
        return build(this);
    }

    public UserBuilder username(String username) {
        user.setUsername(username);
        return this;
    }

    public UserBuilder password(String password) {
        user.setPassword(password);
        return this;
    }

    private User build(UserBuilder userBuilder) {
        if (!StrUtil.isAllNotEmpty(userBuilder.user.getUsername(), userBuilder.user.getPassword())) {
            throw new RuntimeException("数据不合格");
        }
        return this.user;
    }
}
