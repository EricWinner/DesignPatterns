package com.design.pattern.factory;

/**
 * 工厂方法模式
 * 
 * @author EdwardAdmin
 *
 */
public class Client {
    public static void main(String[] args) {
        // 简单工厂
        SimpleLocationFactory factory = new ConcreateLocation();
        Location randomLocation = factory.createLocation("random");
        System.out.println(randomLocation.generateLocation());

        // 根据反射Class.class，生成对应的Product
        ReflectLocationFactory factory2 = new ReflectConcreate();
        Location traverseLocation = factory2.createLocation(TraverseLocation.class);
        System.out.println(traverseLocation.generateLocation());
    }
}
