package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton;
        EditText inputEmail;
        EditText inputPassword;

        loginButton = findViewById(R.id.btn_login);
        inputEmail = findViewById(R.id.input_password);
        inputPassword = findViewById(R.id.input_password);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inputEmail.getText().toString();
                password = inputPassword.getText().toString();
                if(isValidString(email) && isValidString(password)){

                }
            }
        });
    }
    boolean isValidString(String str){
        if(str.trim() == "" && str == null && str.isEmpty()){
            return false;
        }
        return true;
    }
}