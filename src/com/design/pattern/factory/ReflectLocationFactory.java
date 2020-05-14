package com.design.pattern.factory;

public abstract class ReflectLocationFactory {

    // 抽象方法
    public abstract <T extends Location> T createLocation(Class<T> clz);
}
