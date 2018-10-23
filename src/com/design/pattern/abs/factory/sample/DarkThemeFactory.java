package com.design.pattern.abs.factory.sample;

public class DarkThemeFactory extends AbstractThemeFactory {

    @Override
    public ThemeTextView createThemeTextView() {
        return new DarkTextView();
    }

    @Override
    public ThemeActionBar createThemeActionBar() {
        return new DarkActionBar();
    }

}
