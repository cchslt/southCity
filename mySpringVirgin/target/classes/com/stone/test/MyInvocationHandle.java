package com.stone.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * Created by chenchen on 2016/6/27.
 */
public class MyInvocationHandle implements InvocationHandler {
    private Object target;

    public MyInvocationHandle(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------before------");
        Object result = method.invoke(target, args);
        System.out.println("----------after-------");
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
