package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;


public class QuizScore extends AppCompatActivity {

    public EditText et;
    public String sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        et = (EditText) findViewById(R.id.score);

        sc = getIntent().getExtras().getString("Score");
        et.setText(sc);
    }

}