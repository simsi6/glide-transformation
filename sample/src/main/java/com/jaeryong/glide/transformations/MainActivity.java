package com.jaeryong.glide.transformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jaeryong.glide.transformation.CircleTransformation;

public class MainActivity extends AppCompatActivity {

    private ImageView circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circle = (ImageView)findViewById(R.id.circle);

        Glide.with(this)
                .load(R.drawable.korea)
                .override(100, 100)
                .bitmapTransform(new CircleTransformation(this))
                .into(circle);
    }
}