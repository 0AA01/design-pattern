package com.aa03.design.test02;

import java.util.ArrayList;
import java.util.List;

// 责任链阻断实现模式
public class Handler02 {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();

        ArrayList<IHandler> handlers = new ArrayList<>();
        handlers.add(new HandlerA());
        handlers.add(new HandlerB());
        handlers.add(new HandlerC());
        handlerChain.addHandler(handlers);

        boolean result = handlerChain.handle();

        if (!result) {
            System.out.println("责任链中处理器不满足条件");
        }
    }
}

class HandlerChain {
    List<IHandler> handlerList = new ArrayList<>();

    public void addHandler(List<IHandler> handlers) {
        handlerList.addAll(handlers);
    }

    public boolean handle() {
        boolean resultFlag = true;
        for (IHandler each : handlerList) {
            if (!each.handle()) {
                resultFlag = false;
                break;
            }
        }
        return resultFlag;
    }

}

interface IHandler {
    boolean handle();
}

class HandlerA implements IHandler {

    @Override
    public boolean handle() {
        boolean result = true;
        System.out.println("执行HandlerA");
        return result;
    }
}

class HandlerB implements IHandler {

    @Override
    public boolean handle() {
        boolean result = true;
        System.out.println("执行HandlerB");
        return result;
    }
}

class HandlerC implements IHandler {

    @Override
    public boolean handle() {
        boolean result = true;
        System.out.println("执行HandlerC");
        return result;
    }
}

