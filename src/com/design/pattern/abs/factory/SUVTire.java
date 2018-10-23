package com.design.pattern.abs.factory;

public class SUVTire implements ITire {

    @Override
    public void createTire() {
        System.out.println("SUV轮胎");
    }

}
