package com.design.pattern.abs.factory;

public class DomesticEngine implements IEngine {

    @Override
    public void createEngine() {
        System.out.println("国产引擎");
    }

}
