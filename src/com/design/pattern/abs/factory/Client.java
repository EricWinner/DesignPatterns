package com.design.pattern.abs.factory;

public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new Q3Factory();
        carFactory.createTire().createTire();
        carFactory.createEngine().createEngine();
        carFactory.createBrake().createBrake();

        CarFactory carFactory2 = new Q7Factory();
        carFactory2.createTire().createTire();
        carFactory2.createEngine().createEngine();
        carFactory2.createBrake().createBrake();
    }
}
