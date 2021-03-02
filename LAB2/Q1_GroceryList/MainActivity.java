package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView grlist;
    String [] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grlist = findViewById(R.id.Groceries);
        String [] items = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        ArrayAdapter<String> groceryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        grlist.setAdapter(groceryAdapter);
        grlist.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String groceries = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(), "Clicked:"+groceries, Toast.LENGTH_LONG).show();
    }
}