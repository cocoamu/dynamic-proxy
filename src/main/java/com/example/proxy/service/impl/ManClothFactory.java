package com.example.proxy.service.impl;

import com.example.proxy.service.ClothFactory;

public class ManClothFactory implements ClothFactory {
    @Override
    public void productCloth() {
        System.out.println( "男装工厂生产一批衣服" );
    }
}
