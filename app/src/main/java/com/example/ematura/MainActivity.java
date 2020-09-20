package com.example.ematura;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Za to da ne morejo delat posnetkov zaslona
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        button1 = findViewById(R.id.imageButtonM);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMatematika();
            }
        });

        button2 = findViewById(R.id.imageButtonS);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSlovenscina();
            }
        });

        button3 = findViewById(R.id.imageButtonA);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToAnglescina();
            }
        });

    }
    private void moveToMatematika(){
        Intent intent = new Intent(MainActivity.this, MatematikaActivity.class);
        startActivity(intent);
    }
    private void moveToAnglescina(){
        Intent intent = new Intent(MainActivity.this, AnglescinaActivity.class);
        startActivity(intent);
    }
    private void moveToSlovenscina(){
        Intent intent = new Intent(MainActivity.this, SlovenscinaActivity.class);
        startActivity(intent);
    }
}