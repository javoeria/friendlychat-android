package com.google.firebase.codelab.friendlychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        String url = getIntent().getStringExtra("image_url");
        PhotoView myImage = findViewById(R.id.myImage);
        Glide.with(this).load(url).into(myImage);
    }
}
