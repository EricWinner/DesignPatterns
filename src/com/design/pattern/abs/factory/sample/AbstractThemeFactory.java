package com.design.pattern.abs.factory.sample;

public abstract class AbstractThemeFactory {

    public abstract ThemeTextView createThemeTextView();
    public abstract ThemeActionBar createThemeActionBar();
}
