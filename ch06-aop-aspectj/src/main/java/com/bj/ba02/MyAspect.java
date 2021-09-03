package com.bj.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {

    @AfterReturning(value = "execution(* *..SomeService.doOther2(..))",returning = "res")
    public void myAfterReturning(JoinPoint joinPoint,Object res){
        System.out.println(joinPoint);
        System.out.println("after "+res);
        Student student1= (Student) res;
        student1.setAge(88);
        System.out.println(res);
        /*if ("abcd".equals(res)){
            res = "hhh";
            System.out.println(res);
        }*/
    }



}
