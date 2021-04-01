package com.example.okaynowthisisit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button2 = (Button) findViewById(R.id.button2);


    button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int1 = new Intent(MainActivity.this, Activity2.class);
            startActivity(int1);
        }
    });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, MapsActivity2.class);
                startActivity(int1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, ItemListActivity.class);
                startActivity(int1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this, oops.class);
                startActivity(int1);
            }
        });
    }
}




