package com.design.pattern.abs.factory;

public class NormalBrake implements IBrake {

    @Override
    public void createBrake() {
        System.out.println("普通制动系统");
    }

}
