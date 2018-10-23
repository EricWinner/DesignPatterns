package com.design.pattern.abs.factory;

public class NormalTire implements ITire {

    @Override
    public void createTire() {
        System.out.println("普通轮胎");
    }

}
