package com.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class GridViewActivity extends AppCompatActivity {

    GridView myGridView;
    String[] dataArray = {"class1","class2","class3","class1","class2","class3","class1","class2","class3","class1","class2","class3","class1","class2","class3","class1","class2","class3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        myGridView = findViewById(R.id.grid_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dataArray);
        myGridView.setAdapter(adapter);
    }
}