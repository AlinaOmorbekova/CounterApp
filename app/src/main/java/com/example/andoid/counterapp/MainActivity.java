package com.example.andoid.counterapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity<counter> extends AppCompatActivity {
    TextView tvCounter;
    Button btnIncrement;


    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);
        btnIncrement = findViewById(R.id.btnIncrement);

        //on app launch TextView will show zero
        tvCounter.setText("0000");



        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;

                tvCounter.setText(String.format("%04d",counter));
            }
        });
    }
}