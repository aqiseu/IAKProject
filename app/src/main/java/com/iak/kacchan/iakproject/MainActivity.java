package com.iak.kacchan.iakproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(" ");
    }
    public void goResep(View view) {
        Intent intent1 = new Intent(MainActivity.this, ScrollingActivity.class);
        this.startActivity(intent1);
    }
}
