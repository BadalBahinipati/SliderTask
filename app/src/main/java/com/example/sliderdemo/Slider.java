package com.example.sliderdemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Slider extends AppCompatActivity {

    ImageSlider imgsldr;
    ActionBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        bar = getSupportActionBar();
        ColorDrawable cd = new ColorDrawable(Color.parseColor("#B02E2E"));
        bar.setBackgroundDrawable(cd);
        imgsldr = findViewById(R.id.slider);

        ArrayList<SlideModel> slidemodel = new ArrayList<>();

        slidemodel.add(new SlideModel("https://cutewallpaper.org/22/modified-bike-wallpapers/1271311158.jpg", ScaleTypes.FIT));
        slidemodel.add(new SlideModel("https://www.teahub.io/photos/full/3-37770_desktop-heavy-bikes-wallpapers-download-full-hd-bike.jpg", ScaleTypes.FIT));
        slidemodel.add(new SlideModel("https://wallpaper.dog/large/20533317.jpg", ScaleTypes.FIT));
        slidemodel.add(new SlideModel("https://cdn.wallpapersafari.com/79/19/Glq3zJ.jpeg", ScaleTypes.FIT));
        slidemodel.add(new SlideModel("https://wallpaperaccess.com/full/1398287.jpg", ScaleTypes.FIT));

        imgsldr.setImageList(slidemodel, ScaleTypes.FIT);

    }
}