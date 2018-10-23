package com.design.pattern.abs.factory;

public abstract class CarFactory {

    public abstract ITire createTire();
    public abstract IEngine createEngine();
    public abstract IBrake createBrake();
}
