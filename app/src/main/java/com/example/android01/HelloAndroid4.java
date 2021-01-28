package com.example.android01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloAndroid4 extends AppCompatActivity {

    private Button layout1;
    private Button layout2;
    private Button layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android4);

        layout1 = (Button) findViewById(R.id.layout1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lay1 = new Intent(HelloAndroid4.this, com.example.android01.Exercice3a.class);
                startActivity(lay1);
            }
        });

        layout2 = (Button) findViewById(R.id.layout2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lay2 = new Intent(HelloAndroid4.this, com.example.android01.Exercice3b.class);
                startActivity(lay2);
            }
        });

        layout3 = (Button) findViewById(R.id.layout3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lay3 = new Intent(HelloAndroid4.this, com.example.android01.Exercice3c.class);
                startActivity(lay3);
            }
        });


    }

}