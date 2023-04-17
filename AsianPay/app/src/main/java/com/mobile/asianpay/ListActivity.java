package com.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListActivity extends AppCompatActivity {
    ListView myListView;
    String[] dataArray = {"one","two","three","four","five","six","seven","eight","nine","ten","one","two","three","four","five","six","seven","eight","nine","ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        myListView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dataArray);
        myListView.setAdapter(adapter);
    }
}