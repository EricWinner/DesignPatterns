package com.design.pattern.observer;

public class ObserveTest {

    public static void main(String[] args) {
        DesignFrontier designFrontier = new DesignFrontier();

        Coder coder = new Coder("Edward");
        Coder coder1 = new Coder("Jingjing");

        designFrontier.addObserver(coder);
        designFrontier.addObserver(coder1);

        designFrontier.postMessage("画江湖");
    }
}
