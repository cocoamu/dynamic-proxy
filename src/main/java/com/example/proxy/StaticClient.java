package com.example.proxy;

import com.example.proxy.proxy.ManProxy;
import com.example.proxy.proxy.ProxyCompany;
import com.example.proxy.service.ClothFactory;
import com.example.proxy.service.impl.ManClothFactory;

public class StaticClient {
    public static void main(String[] args) {
        //้ๆไปฃ็
        ClothFactory clothFactory = new ManClothFactory();
        ManProxy manProxy = new ManProxy(clothFactory);
        manProxy.productCloth();
    }
}
