package com.bj.ba05;

import com.bj.ba02.Student;

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

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("do first");
        return "first";
    }

    @Override
    public void doSecond() {
        System.out.println("do second"+(10/0));
    }

    @Override
    public void doThird() {
        System.out.println("do second"+(10/0));
    }
}
