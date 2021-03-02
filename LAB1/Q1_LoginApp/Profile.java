package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView tv;
    String st;
    TextView phv;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv = (TextView) findViewById(R.id.textViewName);
        phv = (TextView) findViewById(R.id.textViewPhone);

        st = getIntent().getExtras().getString("Name");
        tv.setText(st);

        st1 = getIntent().getExtras().getString("Phone");
        phv.setText(st1);

    }
}