package com.rohil.excerise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");
        System.out.println(username);
        System.out.println(password);
    }
}