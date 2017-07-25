package com.example.jinphy.chapter_17;

import android.util.Log;

import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by jinphy on 2017/7/24.
 */

public class MyDebugApplication extends MyApplication {
    private static final String TAG = "MyDebugApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        LeakCanary.install(this);
        Log.d(TAG, "onCreate: debug");
    }
}
