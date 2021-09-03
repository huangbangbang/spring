package com.bj.service.impl;

import com.bj.handler.MyInvocationHandler;
import com.bj.service.SomeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        /*SomeService service = new SomeServiceImpl();
        service.doSome();
        service.doOther();*/

        SomeService target = new SomeServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(target);
        SomeService proxy=(SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                               target.getClass().getInterfaces(),
                               handler);
        proxy.doSome();
        proxy.doOther();

    }
}
