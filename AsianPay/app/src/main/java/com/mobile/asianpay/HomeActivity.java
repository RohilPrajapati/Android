package com.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    boolean showAmt = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView img_icon;
        TextView txt_amt;
        txt_amt = findViewById(R.id.txt_amt);
        img_icon = findViewById(R.id.img_icon);

        img_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showAmt){
                    txt_amt.setText("Rs. XXXX.XX");
                    showAmt = false;
                }else{
                    txt_amt.setText("Rs. 1,00,000");
                    showAmt = true;
                }
            }
        });
    }
}