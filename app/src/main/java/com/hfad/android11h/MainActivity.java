package com.hfad.android11h;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView airplane;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.drawable.bg_splash_screen);
        initViews();

        @SuppressLint("ResourceType") Animation AirplaneAnimation = AnimationUtils.loadAnimation(this, R.xml.airplane_rise);
        airplane.startAnimation(AirplaneAnimation);
    }



    private void initViews(){

        airplane = findViewById(R.id.airplane);


    }


    }

