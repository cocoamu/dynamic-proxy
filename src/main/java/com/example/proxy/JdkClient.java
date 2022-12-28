package com.example.proxy;

import com.example.proxy.proxy.ManProxy;
import com.example.proxy.proxy.ProxyCompany;
import com.example.proxy.service.ClothFactory;
import com.example.proxy.service.impl.ManClothFactory;

public class JdkClient {
    public static void main(String[] args) {
        //动态代理
        //1.被代理类的对象
        ClothFactory clothFactory = new ManClothFactory();
        //2.创建一个实现了InvacationHandler接口的类的对象
        ProxyCompany proxyCompany = new ProxyCompany();
        //3.调用blind()方法，动态的返回一个同样实现了real所在类实现的接口Subject的代理类的对象。
        //此时clothFactory就是代理类的对象
        ClothFactory clothFactoryProxy = (ClothFactory) proxyCompany.bind(clothFactory);
        //转到对InvacationHandler接口的实现类的invoke()方法的调用
        clothFactoryProxy.productCloth();
    }
}
