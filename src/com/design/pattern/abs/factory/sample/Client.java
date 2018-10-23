package com.design.pattern.abs.factory.sample;

public class Client {

    public static void main(String[] args) {
        AbstractThemeFactory lightThemeThemeFactory = new LightThemeFactory();
        lightThemeThemeFactory.createThemeActionBar().initIcon();
        lightThemeThemeFactory.createThemeActionBar().initActionBarColor();
        lightThemeThemeFactory.createThemeActionBar().initActionBarTextSize();

        lightThemeThemeFactory.createThemeTextView().initTextViewColor();
        lightThemeThemeFactory.createThemeTextView().initTextViewSize();

        AbstractThemeFactory darkThemeFactory = new DarkThemeFactory();
        darkThemeFactory.createThemeActionBar().initIcon();
        darkThemeFactory.createThemeActionBar().initActionBarColor();
        darkThemeFactory.createThemeActionBar().initActionBarTextSize();

        darkThemeFactory.createThemeTextView().initTextViewColor();
        darkThemeFactory.createThemeTextView().initTextViewSize();
    }
}
