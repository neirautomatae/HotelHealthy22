package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thegrid extends AppCompatActivity {

    private Button nextfood1;
    private Button nextfood2;
    private Button nextfood3;
    private Button backthe01;
    private Button bkhomethe01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thegrid);
        nextfood1 = findViewById(R.id.btnfood1);
        nextfood2 = findViewById(R.id.btnfood2);
        nextfood3 = findViewById(R.id.btnfood3);
        backthe01 = findViewById(R.id.btnbackthe);
        bkhomethe01 = findViewById(R.id.btnhomethe);

        nextfood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood1 = new Intent(Thegrid.this , Food.class);
                startActivity(gofood1);
            }
        });


        nextfood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood2 = new Intent(Thegrid.this , Food2.class);
                startActivity(gofood2);
            }
        });

        nextfood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood3 = new Intent(Thegrid.this , Food3.class);
                startActivity(gofood3);
            }
        });


        backthe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bkhomethe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod01 = new Intent(Thegrid.this , Nutrition.class);
                startActivity(nexthomefod01);
            }
        });


    }
}
