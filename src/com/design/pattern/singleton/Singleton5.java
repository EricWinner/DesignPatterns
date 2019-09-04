package com.design.pattern.singleton;

/**
 * 懒汉式单例
 * 
 * @author EdwardAdmin
 *
 */
public class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 1.线程不安全
     * 
     * @return
     */
    public static Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }

    /**
     * 2.线程安全
     * @return
     */
    public static synchronized Singleton5 getInstance1() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }
}
