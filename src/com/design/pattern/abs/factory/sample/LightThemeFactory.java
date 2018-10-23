package com.design.pattern.abs.factory.sample;

public class LightThemeFactory extends AbstractThemeFactory {

    @Override
    public ThemeTextView createThemeTextView() {
        return new LightTextView();
    }

    @Override
    public ThemeActionBar createThemeActionBar() {
        return new LightActionBar();
    }

}
