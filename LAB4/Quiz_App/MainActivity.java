package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.RadioButton;
import android.content.Intent;
import android.content.Context;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    public RadioButton rd1, rd2, rd3, rd4;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1 = (RadioButton)findViewById(R.id.radioButton);
        rd2 = (RadioButton)findViewById(R.id.radioButton2);
        rd3 = (RadioButton)findViewById(R.id.radioButton3);
        rd4 = (RadioButton)findViewById(R.id.radioButton4);
    }

    public void activateAlert(android.view.View view) {


        int score = 0;

        if (rd2.isChecked()) {
            score += 1;
        }
        if (rd3.isChecked()) {
            score += 1;
        }

        String s = Integer.toString(score);
        AlertDialog.Builder build = new AlertDialog.Builder(context).setTitle("Alert").
                setMessage("Are you ready to submit your responses?").
                setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.out.print("Hello");
                        Intent intent = new Intent(MainActivity.this, QuizScore.class);
                        intent.putExtra("Score", s);
                        startActivity(intent);
                        MainActivity.this.finish();

                    }
                }).
                setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = build.create();
        alertDialog.show();
    }
}