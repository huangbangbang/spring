package com.bj.ba01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("do some");
    }

    @Override
    public void doOther(String name, Integer age) {
        System.out.println("do other");
    }
}
