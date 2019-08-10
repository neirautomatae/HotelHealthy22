package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food2 extends AppCompatActivity {

    private Button backfood201;
    private Button nextfood22;
    private Button nextfood23;
    private Button backfd201;
    private Button bkhome201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);
        backfood201 = findViewById(R.id.btnfood301);
        nextfood22 = findViewById(R.id.btnfood302);
        nextfood23 = findViewById(R.id.btnfood304);
        backfd201 = findViewById(R.id.btnbackfod3);
        bkhome201 = findViewById(R.id.btnhomefod3);


        backfood201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood301 = new Intent(Food2.this , Thegrid.class);
                startActivity(gofood301);
            }
        });

        nextfood22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood302 = new Intent(Food2.this , Food.class);
                startActivity(gofood302);
            }
        });

        nextfood23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gofood303 = new Intent(Food2.this , Food3.class);
                startActivity(gofood303);
            }
        });


        backfd201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bkfod301 = new Intent(Food2.this , Nutrition.class);
                startActivity(bkfod301);
            }
        });

        bkhome201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nexthomefod301 = new Intent(Food2.this , MainActivity.class);
                startActivity(nexthomefod301);
            }
        });

    }
}
