package com.example.imagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //public ImageView image1, image2, image3, image4, image5, image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        image1 = (ImageView)findViewById(R.id.imageView);
//        image2 = (ImageView)findViewById(R.id.imageView2);
//        image3 = (ImageView)findViewById(R.id.imageView3);
//        image4 = (ImageView)findViewById(R.id.imageView8);
//        image5 = (ImageView)findViewById(R.id.imageView9);
//        image6 = (ImageView)findViewById(R.id.imageView10);
    }
    public void ShowCollection(android.view.View view) {
        Intent intent;
        int n = view.getId();
        if (n == R.id.imageView || n == R.id.imageView8) {
            intent = new Intent(MainActivity.this, Image1.class);
            startActivity(intent);
        }
        else if (n == R.id.imageView2 || n == R.id.imageView9) {
            intent = new Intent(MainActivity.this, Image2.class);
            startActivity(intent);
        }
        else if (n == R.id.imageView3 || n == R.id.imageView10) {
            intent = new Intent(MainActivity.this, Image3.class);
            startActivity(intent);
        }
    }

}