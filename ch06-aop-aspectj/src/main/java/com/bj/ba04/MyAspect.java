package com.bj.ba04;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    @AfterThrowing(value = "execution(* *..doSecond(..))",
            throwing = "ex")
    public void myAfterThrowing(Exception ex){
        System.out.println(ex);
    }
}
