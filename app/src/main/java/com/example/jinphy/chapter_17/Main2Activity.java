package com.example.jinphy.chapter_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        User jinphy = null;
        try {
            jinphy = (User)intent.getSerializableExtra("jinphy");
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, jinphy.getName(), Toast.LENGTH_SHORT).show();

    }
}
