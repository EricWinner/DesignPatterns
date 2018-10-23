package com.design.pattern.factory;

public class ConcreteFactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        return null;
    }

}
