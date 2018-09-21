package com.design.pattern.singleton;

public class Singleton3 {

    private static final class InstanceHolder {
        private static Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
