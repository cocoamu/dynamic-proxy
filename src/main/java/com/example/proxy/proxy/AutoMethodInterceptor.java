package com.example.proxy.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AutoMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod();
        Object object = methodProxy.invokeSuper(o, objects);
        afterMethod();
        return object;
    }

    private void beforeMethod(){
        System.out.println("Cglib代理公司介绍");
    }

    private void afterMethod(){
        System.out.println("Cglib代理公司售后");
    }
}
