package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food3 extends AppCompatActivity {

    private Button backfood301;
    private Button nextfood302;
    private Button nextfood303;
    private Button backfd301;
    private Button bkhome301;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food3);
        backfood301 = findViewById(R.id.btnfood411);
        nextfood302 = findViewById(R.id.btnfood422);
        nextfood303 = findViewById(R.id.btnfood433);
        backfd301 = findViewById(R.id.btnbackfod3);
        bkhome301 = findViewById(R.id.btnhomefod3);


        backfood301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood401 = new Intent(Food3.this , Thegrid.class);
                startActivity(gofood401);
            }
        });

        nextfood302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood402 = new Intent(Food3.this , Food.class);
                startActivity(gofood402);
            }
        });

        nextfood303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood403 = new Intent(Food3.this , Food2.class);
                startActivity(gofood403);
            }
        });



        backfd301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkfod401 = new Intent(Food3.this , Nutrition.class);
                startActivity(bkfod401);
            }
        });

        bkhome301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod401 = new Intent(Food3.this , MainActivity.class);
                startActivity(nexthomefod401);
            }
        });

    }
}

