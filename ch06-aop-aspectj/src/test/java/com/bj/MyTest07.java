package com.bj;


import com.bj.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");
        System.out.println(proxy.getClass().getName());
        proxy.doThird();
    }
}
