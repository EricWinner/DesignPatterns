package com.design.pattern.abs.factory.sample;

public class LightActionBar extends ThemeActionBar{

    @Override
    public void initIcon() {
        System.out.println("init Light ActionBar icon");
    }

    @Override
    public void initActionBarColor() {
        System.out.println("init Light ActionBar color");
    }

    @Override
    public void initActionBarTextSize() {
        System.out.println("init Light ActionBar size");
    }

}
