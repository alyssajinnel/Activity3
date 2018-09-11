package com.example.user.activity3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnMain = (Button)findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), second.class);
                startActivity(moveSecond);
                }
        });

        Button btnMain2 = (Button)findViewById(R.id.btnMain2);
        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveThird = new Intent(getApplicationContext(), third.class);
                startActivity(moveThird);
            }
        });

        Button btnMain3 = (Button)findViewById(R.id.btnMain3);
        btnMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveForth = new Intent(getApplicationContext(), forth.class);
                startActivity(moveForth);
            }
        });


}


}