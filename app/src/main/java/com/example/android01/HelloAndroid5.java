package com.example.android01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HelloAndroid5 extends Activity {

    private Button button;
    private Button button2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android5);

        button = (Button) findViewById(R.id.mainbutton);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),R.string.message1, Toast.LENGTH_LONG).show();
            }
        });

//Code à rajouter demandé
        button2 = (Button) findViewById(R.id.mainbutton2);
        button2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View arg0) {
                Toast.makeText(getApplicationContext(),R.string.message2, Toast.LENGTH_LONG).show();
                return true;
            }
        });

    }

}