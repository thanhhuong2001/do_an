package com.example.do_an;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }
    public void user(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity3.class);
        startActivity(intent);
    }
    public void quanly(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
    public void setting(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
        startActivity(intent);
    }
}