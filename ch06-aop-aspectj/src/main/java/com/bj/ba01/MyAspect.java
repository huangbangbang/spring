package com.bj.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    /*@Before(value = "execution(public void com.bj.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println(new Date());
    }*/
    /*@Before(value = "execution( void com.bj.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println(new Date());
    }*/
    /*@Before(value = "execution(public void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        System.out.println(new Date());
    }*/
    /*@Before(value = "execution(* *..SomeServiceImpl.doSome(..))")
    public void myBefore(){
        System.out.println(new Date());
    }*/
    /*@Before(value = "execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore(){
        System.out.println(new Date());
    }*/
    @Before(value = "execution(* do*(..))")
    public void myBefore(JoinPoint jp){
        /*System.out.println(jp.getSignature());
        System.out.println(jp.getSignature().getName());
        Object args[] = jp.getArgs();
        for (Object a:args
             ) {
            System.out.println(a);
        }*/
        System.out.println(new Date());
    }
}
