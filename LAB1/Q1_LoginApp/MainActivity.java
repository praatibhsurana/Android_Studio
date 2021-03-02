package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public EditText name;
    public EditText email;
    public EditText pw;
    public EditText ph;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.Name);
        email = (EditText)findViewById(R.id.Email);
        pw = (EditText)findViewById(R.id.Password);
        ph = (EditText)findViewById(R.id.Phone);
        button = (Button) findViewById(R.id.button);

    }


    public void displayToast(android.view.View v){


        String pw1 = String.valueOf(pw.getText());
        String ph1 = String.valueOf(ph.getText());
        String st = String.valueOf(name.getText());


        if((pw1.equals("bonk")) & (ph1.length() == 10)){
            Toast.makeText(MainActivity.this, "Valid Details", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,Profile.class);
            intent.putExtra("Name", st);
            intent.putExtra("Phone", ph1);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this, "Invalid Details", Toast.LENGTH_SHORT).show();
        }


    }
}