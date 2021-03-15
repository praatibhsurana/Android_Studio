package com.example.bgcolorchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout)findViewById(R.id.background);
    }
    public void Color1(android.view.View view) {
        layout.setBackgroundColor(Color.BLUE);
    }
    public void Color2(android.view.View view) {
        layout.setBackgroundColor(Color.RED);
    }
    public void Color3(android.view.View view) {
        layout.setBackgroundColor(Color.GREEN);
    }
}