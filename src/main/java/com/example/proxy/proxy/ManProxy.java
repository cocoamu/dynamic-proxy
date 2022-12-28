package com.example.proxy.proxy;

import com.example.proxy.service.ClothFactory;

public class ManProxy implements ClothFactory {

    private ClothFactory cf;

    public ManProxy(ClothFactory clothFactory) {
        cf = clothFactory;
    }

    @Override
    public void productCloth() {
        beforeMethod();
        cf.productCloth();
        afterMethod();
    }

    private void beforeMethod(){
        System.out.println("男装销售代理介绍");
    }

    private void afterMethod(){
        System.out.println("男装销售代理售后");
    }
}