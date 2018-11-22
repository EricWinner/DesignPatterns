package com.design.pattern.observer;

import java.util.Observable;

public class DesignFrontier extends Observable {

    public void postMessage(String content) {
        setChanged();
        notifyObservers(content);
    }

}
