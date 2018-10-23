package com.design.pattern.factory;

public class ConcreteFactoryB extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        return null;
    }

}
