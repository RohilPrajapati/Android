package com.rohil.excerise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_login,btn_registration,btn_forget_pass;
        EditText username,password;

        btn_login = findViewById(R.id.btn_login);
        btn_registration = findViewById(R.id.btn_register);
        btn_forget_pass = findViewById(R.id.btn_forget_pass);
        username = findViewById(R.id.input_username);
        password = findViewById(R.id.input_password);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,HomePage.class);
                intent.putExtra("username",username.getText().toString());
                intent.putExtra("password",password.getText().toString());
                startActivity(intent);
            }
        });

        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,Register.class);
                startActivity(intent);
            }
        });
        btn_forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,ForgetPassword.class);
                startActivity(intent);
            }
        });


    }
}