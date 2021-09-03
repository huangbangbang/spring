package com.bj.ba02;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("do some");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("do other");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student("jack",20);
        return student;
    }

}
