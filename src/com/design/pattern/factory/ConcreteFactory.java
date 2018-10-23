package com.design.pattern.factory;

public class ConcreteFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }

}
