package com.design.pattern.factory;

/**
 * 工厂方法模式
 * @author EdwardAdmin
 *
 */
public class Client {
    public static void main(String[] args) {
        // 简单工厂
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();

        //根据反射Class.class，生成对应的Product
        Factory factory2 = new ConcreteFactory();
        Product product2 = factory2.createProduct(ConcreteProductB.class);
        product2.method();

        //多工厂方法模式
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.method();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.method();
    }
}
