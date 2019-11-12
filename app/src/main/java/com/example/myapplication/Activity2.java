package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView et;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("Log_test", "onCreate: done");

        et=findViewById(R.id.edit_value);

        st = getIntent().getStringExtra("value");
        et.setText(st);
    }
}
