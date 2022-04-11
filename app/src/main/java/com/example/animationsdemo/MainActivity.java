package com.example.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    public void fade(View view)
    {

        ImageView image = (ImageView) findViewById(R.id.imageCenter);
        image.animate().alpha(0).setDuration(2000);  // Adds animation to image. setDuration takes milliseconds
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}