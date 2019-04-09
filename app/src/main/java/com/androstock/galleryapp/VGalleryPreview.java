package com.androstock.galleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by SHAJIB on 25/12/2015.
 */
public class VGalleryPreview extends AppCompatActivity {

    ImageView GalleryPreviewImg;
    String path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.vgallery_preview);
        Intent intent = getIntent();
        path = intent.getStringExtra("path");
        GalleryPreviewImg = (ImageView) findViewById(R.id.GalleryPreviewImg);
        Glide.with(VGalleryPreview.this)
                .load(new File(path)) // Uri of the picture
                .into(GalleryPreviewImg);
    }
}
