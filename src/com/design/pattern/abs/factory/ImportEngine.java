package com.design.pattern.abs.factory;

public class ImportEngine implements IEngine {

    @Override
    public void createEngine() {
        System.out.println("进口引擎");
    }

}
