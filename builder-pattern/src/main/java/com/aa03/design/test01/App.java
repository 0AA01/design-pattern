package com.aa03.design.test01;

public class App {
    public static void main(String[] args) {
        User user = UserBuilder.create()
                .username("")
                .password("bb")
                .build();
        System.out.println(user);
    }
}
