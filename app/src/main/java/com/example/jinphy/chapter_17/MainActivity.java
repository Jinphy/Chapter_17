package com.example.jinphy.chapter_17;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import hugo.weaving.DebugLog;

public class MainActivity extends AppCompatActivity {


    public  Handler handler = new MyHandler() ;


    private static class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
        }
    }

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoftReference<String> s = new SoftReference<String>(new String("soft reference"));
        Log.d(TAG, "onCreate: "+s.get());
        System.gc();
        Log.d(TAG, "onCreate: "+s.get());


        WeakReference<String> ss = new WeakReference<String>(new String("soft reference"));
        Log.d(TAG, "onCreate_1: "+ss.get());
        System.gc();
        Log.d(TAG, "onCreate_1: "+ss.get());
        method("hello","aspectj",10,true);
    }

    @DebugLog
    private String method(String ar1, String ar2, int ar3, boolean ar4) {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SparseArray<String> map = new SparseArray<>();

        SparseBooleanArray m = new SparseBooleanArray();
        return ar1;
    }
}
