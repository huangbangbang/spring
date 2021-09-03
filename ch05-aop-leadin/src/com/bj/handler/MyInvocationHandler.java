package com.bj.handler;

import com.bj.util.ServiceTools;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;
        if ("doSome".equals(method.getName())){
            ServiceTools.doLog();
            res=method.invoke(target,args);
            ServiceTools.doTrans();
        }else {
            res=method.invoke(target,args);
        }

        return res;
    }
}
