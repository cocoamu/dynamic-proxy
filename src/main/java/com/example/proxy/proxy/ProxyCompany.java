package com.example.proxy.proxy;

import com.example.proxy.service.ClothFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyCompany implements InvocationHandler {

    private Object obj;

   public Object bind(Object obj){
       this.obj = obj;
       return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),this);
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object returnVal = method.invoke( obj, args);
        afterMethod();
        return returnVal;
    }

    private void beforeMethod(){
        System.out.println("JDK代理公司介绍");
    }

    private void afterMethod(){
        System.out.println("JDK代理公司售后");
    }
}
