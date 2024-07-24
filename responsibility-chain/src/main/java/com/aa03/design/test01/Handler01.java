package com.aa03.design.test01;

import java.util.ArrayList;
import java.util.List;

// 责任链无阻断实现模式
public class Handler01 {

    public static void main(String[] args) {

        HandlerChain handlerChain = new HandlerChain();

        ArrayList<IHandler> handlers = new ArrayList<>();
        handlers.add(new HandlerA());
        handlers.add(new HandlerB());
        handlers.add(new HandlerC());
        handlerChain.addHandler(handlers);

        handlerChain.handle();
    }
}

class HandlerChain {
    List<IHandler> handlerList = new ArrayList<>();

    public void addHandler(List<IHandler> handlers) {
        handlerList.addAll(handlers);
    }

    public void handle() {
        handlerList.forEach(IHandler::handle);
    }
}

interface IHandler {
    void handle();
}

class HandlerA implements IHandler{

    @Override
    public void handle() {
        System.out.println("执行HandlerA");
    }
}
class HandlerB implements IHandler{

    @Override
    public void handle() {
        System.out.println("执行HandlerB");
    }
}

class HandlerC implements IHandler{

    @Override
    public void handle() {
        System.out.println("执行HandlerC");
    }
}