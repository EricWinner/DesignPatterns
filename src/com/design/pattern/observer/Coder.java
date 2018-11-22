package com.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

    public String mCoderName;

    public Coder(String coderName) {
        this.mCoderName = coderName;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hello, " + mCoderName + "! " + arg + "更新了！");
    }

}
