package com.bj;

import com.bj.ba03.Student;
import com.bj.ba03.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

public class MyTest {

    @Test
    public void test01(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);

    }
    @Test
    public void test02(){
        //String config = "ba01/applicationContext.xml";
        // ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = new Student();
        student.setName("李四");
        student.setAge(20);
        School school = new School();
        school.setName("bjpowernode");
        school.setAddress("bj");
        student.setSchool(school);
        //Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);
    }
    @Test
    public void test03(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("mystudent2");
        System.out.println(student);

    }
    @Test
    public void test04(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        File file = (File) ac.getBean("myfile");
        System.out.println(file.getName());

    }
}
