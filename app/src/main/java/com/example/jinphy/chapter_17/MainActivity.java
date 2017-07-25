package com.example.jinphy.chapter_17;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //public  Handler handler = new MyHandler() ;


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

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                startActivity();
                break;
            default:
                break;
        }
    }

    private void startActivity() {
        Intent intent = new Intent();
        intent.setClass(this,Main2Activity.class);
        //intent.setComponent(new ComponentName(getPackageName(), Main2Activity.class.getName()));
        User user = new User();
        user.setAge(19);
        user.setName("jinphy");
        intent.putExtra("jinphy", user);
        this.startActivity(intent);

        SharedPreferences pre = this.getSharedPreferences("my_property", MODE_PRIVATE);

        SharedPreferences.Editor edit = pre.edit();
        edit.putBoolean("ok", true);
        edit.putString("name", "jinphy");
        edit.putString("gender", "male");
        edit.putInt("age", 19);
        edit.commit();

        Toast.makeText(this, ""+pre.getString("name","null"), Toast.LENGTH_SHORT).show();

    }


}
