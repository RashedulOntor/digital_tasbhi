package com.example.digitaltasbhi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub, buttonRestart;
    int count =0;
    TextView tvNextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tvCount = findViewById(R.id.tvCount);
       buttonAdd =findViewById(R.id.buttonAdd);
       buttonSub = findViewById(R.id.buttonSub);
       buttonRestart = findViewById(R.id.buttonRestart);

       tvNextPage = findViewById(R.id.tvNextPage);




       buttonAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               count++ ;
               tvCount.setText(""+count);
           }

       });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count > 0) {
                    count--;
                }

                tvCount.setText(""+count);

            }

        });


        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = 0 ;
                tvCount.setText("0");

            }

        });


        tvNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);


            }
        });




    }


}