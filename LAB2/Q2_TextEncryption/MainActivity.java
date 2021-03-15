package com.example.textencryption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText normalText;
    public TextView encryptedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalText = (EditText)findViewById(R.id.normalText);
        encryptedText = (TextView) findViewById(R.id.encryptedText);
    }

    public void Encrypt(android.view.View view) {
        String normal = String.valueOf(normalText.getText());
        String encrypt = " ";
        //String encrypt = String.valueOf(encryptedText.getText());
        for (int i = 0; i<normal.length(); i++) {
            char ch = normal.charAt(i);
            if(ch == 'z' || ch=='Z') {
                ch = 'a';
            }
            else {
                ch = (char)((int)ch + 1);
            }

            encrypt = ch + encrypt;
        }
        encryptedText.setText(encrypt);

    }
}