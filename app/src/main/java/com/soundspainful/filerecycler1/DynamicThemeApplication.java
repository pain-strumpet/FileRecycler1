package com.soundspainful.filerecycler1;

public class DynamicThemeApplication extends com.vuzix.hud.resources.DynamicThemeApplication {
    @Override
    protected int getNormalThemeResId() {
        return R.style.AppTheme;
    }

    @Override
    protected int getLightThemeResId() {
        return R.style.AppTheme_Light;
    }
}

