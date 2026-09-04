package com.example.digitaltasbhi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_3 extends AppCompatActivity {

    TextView allahuakbar,alhamdulillah,subahanallah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);

        allahuakbar = findViewById(R.id.allahuakbar);
        alhamdulillah = findViewById(R.id.alhamdulillah);
        subahanallah = findViewById(R.id.subahanallah);

        allahuakbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(myIntent);


            }
        });


        alhamdulillah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(myIntent);


            }
        });


        subahanallah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(myIntent);


            }
        });




    }
}