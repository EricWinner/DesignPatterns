package com.design.pattern.abs.factory.sample;

public class DarkActionBar extends ThemeActionBar {

    @Override
    public void initIcon() {
        System.out.println("init Dark ActionBar icon");
    }

    @Override
    public void initActionBarColor() {
        System.out.println("init Dark ActionBar color");
    }

    @Override
    public void initActionBarTextSize() {
        System.out.println("init Dark ActionBar size");
    }

}
