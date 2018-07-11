package com.tutorial.letsplay;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class satu_activity extends AppCompatActivity {

    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu_activity);

        btn2 = findViewById(R.id.button23);
        btn3 = findViewById(R.id.button24);

        btn2.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), dua_activity.class);
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
