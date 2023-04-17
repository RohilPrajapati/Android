package com.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().hide();
        Button btn_back_login,btn_register;
        RadioButton male,female;
        CheckBox agreeTerms;


        agreeTerms = findViewById(R.id.chk_box_terms);


        male = findViewById(R.id.btn_male);
        female = findViewById(R.id.btn_female);

        btn_back_login = findViewById(R.id.btn_back_login);
        btn_register = findViewById(R.id.btn_register);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(view);
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRadioButtonClicked(view);
            }
        });

        btn_back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        agreeTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(Registration.this, "term and condition have been change", Toast.LENGTH_SHORT).show();
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btn_male:
                if (checked)
                    // Pirates are the best
                    Toast.makeText(this, "U clicked male", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_female:
                if (checked)
                    Toast.makeText(this, "U clicked Female", Toast.LENGTH_SHORT).show();
                // Ninjas rule
                break;
        }
    }
}