package com.example.hotelhealthy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise extends AppCompatActivity {

    private Button exbackhealth;
    private Button exbbackhome;
    private Button nextyoga;
    private Button nextpajamone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        exbackhealth = findViewById(R.id.btnbackHealth);
        exbbackhome = findViewById(R.id.btnbackexhome);
        nextyoga = findViewById(R.id.btnyoga);
        nextpajamone = findViewById(R.id.btnpajamone);

        exbackhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        exbbackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m1 = new Intent(Exercise.this , MainActivity.class);
                startActivity(m1);
            }
        });

        nextyoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yogaep1 = new Intent(Intent.ACTION_VIEW);
                yogaep1.setData(Uri.parse("https://www.youtube.com/watch?v=H2p5QuIs8V8&feature=youtu.be"));
                startActivity(yogaep1);
            }
        });

        nextpajamone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pajamoneep1 = new Intent(Intent.ACTION_VIEW);
                pajamoneep1.setData(Uri.parse("https://www.youtube.com/watch?v=rZsjcw5R6ZI"));
                startActivity(pajamoneep1);
            }
        });

    }
}
