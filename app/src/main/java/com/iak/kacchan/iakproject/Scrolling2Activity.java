package com.iak.kacchan.iakproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Scrolling2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);}

    public void goSaguKeju(View view){
        Intent intent2 = new Intent(Scrolling2Activity.this, Scrolling3Activity.class);
        this.startActivity(intent2);
    }
}
