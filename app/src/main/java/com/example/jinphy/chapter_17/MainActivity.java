package com.example.jinphy.chapter_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Method;

import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        method("hello","aspectj",10,true);
    }

    @DebugLog public String method(String ar1, String ar2, int ar3, boolean ar4) {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return ar1;
    }
}
