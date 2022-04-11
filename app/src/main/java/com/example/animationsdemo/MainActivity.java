package com.example.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private boolean catShowing = true;

    public void fade(View view)
    {
        ImageView imageCat = (ImageView) findViewById(R.id.imageCat);
        ImageView imageTiger = (ImageView) findViewById(R.id.imageTiger);

        if (catShowing)
        {

            imageCat.animate().alpha(0).setDuration(2000);  // Adds animation to image. setDuration takes milliseconds
            imageTiger.animate().alpha(1).setDuration(2000);
            catShowing = false;
        }
        else
        {
            imageCat.animate().alpha(1).setDuration(2000);  // Adds animation to image. setDuration takes milliseconds
            imageTiger.animate().alpha(0).setDuration(2000);
            catShowing = true;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}