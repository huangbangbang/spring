package com.bj;

import com.bj.service.SomeService;
import com.bj.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService)ac.getBean("someService");
        service.doSome();
    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int num = ac.getBeanDefinitionCount();

        String names[]=ac.getBeanDefinitionNames();
        //SomeService service = (SomeService)ac.getBean("someService");
        //service.doSome();
        System.out.println(num);
        for (String s:names
             ) {
            System.out.println(s);
        }
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ac.getBean("myDate");
        System.out.println(date);
    }
}
