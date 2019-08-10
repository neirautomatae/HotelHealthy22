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
    private Button nextyoga3;
    private Button nextyoga4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        exbackhealth = findViewById(R.id.btnbackHealth);
        exbbackhome = findViewById(R.id.btnbackexhome);
        nextyoga = findViewById(R.id.btnyoga1);
        nextpajamone = findViewById(R.id.btnyoga2);
        nextyoga3 = findViewById(R.id.btnyoga3);
        nextyoga4 = findViewById(R.id.btnyoga4);

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
                yogaep1.setData(Uri.parse("https://www.youtube.com/watch?v=HQsh_sRpSnQ&list=PLoqd5KN7Vo0w22udiX3jqKocwP5_srt2k&index=3"));
                startActivity(yogaep1);
            }
        });

        nextpajamone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pajamoneep1 = new Intent(Intent.ACTION_VIEW);
                pajamoneep1.setData(Uri.parse("https://www.youtube.com/watch?v=UEBAHEHC76M&list=PLoqd5KN7Vo0w22udiX3jqKocwP5_srt2k&index=4"));
                startActivity(pajamoneep1);
            }
        });

        nextyoga3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yogaep3 = new Intent(Intent.ACTION_VIEW);
                yogaep3.setData(Uri.parse("https://www.youtube.com/watch?v=JQ9w7IV44iU&list=PLoqd5KN7Vo0w22udiX3jqKocwP5_srt2k&index=1"));
                startActivity(yogaep3);
            }
        });

        nextyoga4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yogaep4 = new Intent(Intent.ACTION_VIEW);
                yogaep4.setData(Uri.parse("https://www.youtube.com/watch?v=y4ifBuH6anM&list=PLoqd5KN7Vo0w22udiX3jqKocwP5_srt2k&index=2"));
                startActivity(yogaep4);
            }
        });

    }
}
