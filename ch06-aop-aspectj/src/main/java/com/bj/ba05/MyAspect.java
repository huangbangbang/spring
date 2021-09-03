package com.bj.ba05;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @After(value = "execution(* *..doThird(..))")
    public void myAfter(){
        System.out.println(".....");
    }
}


