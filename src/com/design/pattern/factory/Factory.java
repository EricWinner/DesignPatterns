package com.design.pattern.factory;

public abstract class Factory {

    //默认的设计
    public abstract Product createProduct();

    //抽象方法
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
