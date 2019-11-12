package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button mButton;
    EditText tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button_create);
        tv = findViewById(R.id.txtSub);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Log_test", "onClick: done" );
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                String st=tv.getText().toString();
                intent.putExtra("value",st);
                startActivity(intent);
            }
        });

    }

}
