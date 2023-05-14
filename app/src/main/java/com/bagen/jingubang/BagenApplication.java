package com.bagen.jingubang;

import android.app.Application;
import android.content.Context;

import com.bagen.mykoom.KoomManager;

public class BagenApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        KoomManager.run(this);
    }
}
