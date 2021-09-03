package com.bj.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "myStudent")
@Component("myStudent")
//@Component
public class Student {
    @Value("张三")
    private String name;
    @Value("19")
    private Integer age;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
