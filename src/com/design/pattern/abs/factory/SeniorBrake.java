package com.design.pattern.abs.factory;

public class SeniorBrake implements IBrake {

    @Override
    public void createBrake() {
        System.out.println("高级制动系统");
    }

}
