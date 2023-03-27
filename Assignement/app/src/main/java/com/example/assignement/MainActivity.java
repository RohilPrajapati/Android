package com.example.assignement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_inc,btn_dec;
        TextView num;
        btn_inc = findViewById(R.id.inc);
        btn_dec = findViewById(R.id.dec);
        num = findViewById(R.id.num);
        btn_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = Integer.parseInt(num.getText().toString().trim());
                count=count+1;
                System.out.print(count);
                Integer.toString(count);
                num.setText(Integer.toString(count));

            }
        });
        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = Integer.parseInt(num.getText().toString().trim());
                count=count-1;
                System.out.print(count);
                Integer.toString(count);
                num.setText(Integer.toString(count));

            }
        });


    }
}