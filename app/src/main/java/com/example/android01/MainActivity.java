package com.example.android01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ex11;
    private Button ex12;
    private Button ex2;
    private Button ex3;
    private Button ex4;
    private Button ex5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ex11 = (Button) findViewById(R.id.button11);
        ex11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo11 = new Intent(MainActivity.this, com.example.android01.HelloAndroid.class);
                startActivity(exo11);
            }
        });

        ex12 = (Button) findViewById(R.id.button12);
        ex12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo12 = new Intent(MainActivity.this, com.example.android01.HelloAndroid2.class);
                startActivity(exo12);
            }
        });

        ex2 = (Button) findViewById(R.id.button2);
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo2 = new Intent(MainActivity.this, com.example.android01.HelloAndroid3.class);
                startActivity(exo2);
            }
        });

        ex3 = (Button) findViewById(R.id.button3);
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo3 = new Intent(MainActivity.this, com.example.android01.HelloAndroid4.class);
                startActivity(exo3);
            }
        });

        ex4 = (Button) findViewById(R.id.button4);
        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo4 = new Intent(MainActivity.this, com.example.android01.HelloAndroid5.class);
                startActivity(exo4);
            }
        });

        ex5 = (Button) findViewById(R.id.button5);
        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo5 = new Intent(MainActivity.this, com.example.android01.HelloAndroid6.class);
                startActivity(exo5);
            }
        });

    }

}