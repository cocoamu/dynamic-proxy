package com.example.proxy;

import com.example.proxy.proxy.AutoMethodInterceptor;
import com.example.proxy.proxy.ProxyCompany;
import com.example.proxy.service.ClothFactory;
import com.example.proxy.service.impl.ManClothFactory;
import org.springframework.cglib.proxy.Enhancer;

public class CglibClient {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类
        enhancer.setSuperclass(ManClothFactory.class);
        // 通过回调函数，将增强类引入到生成的代理类中
        enhancer.setCallback(new AutoMethodInterceptor());
        // 生成代理对象
        ClothFactory clothFactory = (ClothFactory)enhancer.create();
        // 通过代理对象调用目标方法
        clothFactory.productCloth();
    }
}
