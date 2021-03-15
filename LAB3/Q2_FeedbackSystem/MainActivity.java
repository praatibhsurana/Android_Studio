package com.example.feedbacksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RadioButton rd1;
    public RadioButton rd2;
    public RadioButton rd3;
    public CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1 = (RadioButton)findViewById(R.id.radioButton4);
        rd2 = (RadioButton)findViewById(R.id.radioButton5);
        rd3 = (RadioButton)findViewById(R.id.radioButton6);
        cb1 = (CheckBox)findViewById(R.id.checkBox3);
        cb2 = (CheckBox)findViewById(R.id.checkBox4);
        cb3 = (CheckBox)findViewById(R.id.checkBox5);
    }

    public void ViewResponse(android.view.View view) {
        String toastText = " ";
        String toastActor = " ";
        if (rd1.isChecked()) {
            toastText = toastText + String.valueOf(rd1.getText()) + " ";
        }
        else if (rd2.isChecked()) {
            toastText = toastText + String.valueOf(rd2.getText()) + " ";
        }
        else if (rd3.isChecked()) {
            toastText = toastText + String.valueOf(rd3.getText()) + " ";
        }
        if (cb1.isChecked()) {
            toastActor = toastActor + String.valueOf(cb1.getText()) + " ";
        }
        if (cb2.isChecked()) {
            toastActor = toastActor + String.valueOf(cb2.getText()) + " ";
        }
        if (cb3.isChecked()) {
            toastActor = toastActor + String.valueOf(cb3.getText()) + " ";
        }
        Toast.makeText(MainActivity.this, "You liked the movie:" + toastText, Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "You liked the actor(s):" + toastActor, Toast.LENGTH_SHORT).show();
    }
}