package com.bj.ba08;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @After(value = "mypt()")
    public void myAfter(){
        System.out.println(".....");
    }
    @Before(value = "mypt()")
    public void myBefore(){
        System.out.println(".....");
    }
    @Pointcut(value = "execution(* *..doThird(..))")
    public void mypt(){

    }
}


