package com.design.pattern.abs.factory.sample;

public class DarkTextView extends ThemeTextView {

    @Override
    public void initTextViewColor() {
        System.out.println("init Dark TextView color ");
    }

    @Override
    public void initTextViewSize() {
        System.out.println("init Dark TextView size");
    }

}
