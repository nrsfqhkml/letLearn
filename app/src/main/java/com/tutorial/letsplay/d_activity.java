package com.tutorial.letsplay;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class d_activity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_activity);

        btn1 = findViewById(R.id.button9);
        btn2 = findViewById(R.id.button10);
        btn3 = findViewById(R.id.button11);

        btn1.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), c_activity.class);
                startActivity(intent);
            }

        });

        btn2.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), e_activity.class);
                startActivity(intent);
            }

        });

        btn3.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}



