package com.bj.ba03;

import com.bj.ba03.School;

public class Student {
    private String name;
    private int age;

    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public Student() {
    }

    public Student(String myname, int myage, School myschool) {
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
