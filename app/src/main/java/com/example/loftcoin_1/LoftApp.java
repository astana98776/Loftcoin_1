package com.example.loftcoin_1;

import android.app.Application;
import android.os.StrictMode;

public class LoftApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG){
            StrictMode.enableDefaults();
        }
    }
}
