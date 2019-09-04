package com.design.pattern.singleton;

/**
 * 饿汉式单例
 * 
 * @author EdwardAdmin
 *
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
