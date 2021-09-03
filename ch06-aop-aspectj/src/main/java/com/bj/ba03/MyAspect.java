package com.bj.ba03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        String name ="";
        Object args[]=pjp.getArgs();
        if (args!=null&&args.length>0){
            Object arg = args[0];
            name= (String)arg;
        }
        Object result = null;
        System.out.println(new Date());
        if (name.equals("jack")){
            result = pjp.proceed();
        }
        System.out.println("............");
        if (result!=null){
            result ="hello";
        }
        return result;
    }
}
