package com.noel_inc.android_mvp_demo_ii.root;

import android.app.Application;

public class App  extends Application {

    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}