package com.design.pattern.abs.factory.sample;

public class LightTextView extends ThemeTextView {

    @Override
    public void initTextViewColor() {
        System.out.println("init Light TextView color ");
    }

    @Override
    public void initTextViewSize() {
        System.out.println("init Light TextView size");
    }

}
