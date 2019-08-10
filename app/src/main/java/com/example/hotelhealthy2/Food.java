package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food extends AppCompatActivity {

    private Button backfood01;
    private Button nextfood02;
    private Button nextfood03;

    private Button backfd01;
    private Button bkhome01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        backfood01 = findViewById(R.id.btnfood201);
        nextfood02 = findViewById(R.id.btnfood204);
        nextfood03 = findViewById(R.id.btnfood203);
        backfd01 = findViewById(R.id.btnbackfod2);
        bkhome01 = findViewById(R.id.btnhomefod2);


        backfood01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood201 = new Intent(Food.this , Thegrid.class);
                startActivity(gofood201);
            }
        });

        nextfood02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood202 = new Intent(Food.this , Food3.class);
                startActivity(gofood202);
            }
        });

        nextfood03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood203 = new Intent(Food.this , Food2.class);
                startActivity(gofood203);
            }
        });


        backfd01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkfod01 = new Intent(Food.this , Nutrition.class);
                startActivity(bkfod01);
            }
        });

        bkhome01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod01 = new Intent(Food.this , MainActivity.class);
                startActivity(nexthomefod01);
            }
        });

    }
}
