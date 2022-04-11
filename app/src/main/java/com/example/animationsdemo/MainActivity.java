package com.example.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    public void fade(View view)
    {

        ImageView imageCat = (ImageView) findViewById(R.id.imageCat);
        imageCat.animate().alpha(0).setDuration(2000);  // Adds animation to image. setDuration takes milliseconds

        ImageView imageTiger = (ImageView) findViewById(R.id.imageTiger);
        imageTiger.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}