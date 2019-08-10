package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Disease extends AppCompatActivity {
    private Button backmenuho;
    private Button backhel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        backmenuho = findViewById(R.id.btndis);
        backhel = findViewById(R.id.btnbackhel);




        backmenuho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        backhel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hel = new Intent(Disease.this ,MainActivity.class);
                startActivity(hel);

            }
        });

    }
}
