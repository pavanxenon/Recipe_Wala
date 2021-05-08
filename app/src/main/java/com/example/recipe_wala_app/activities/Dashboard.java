package com.example.recipe_wala_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipe_wala_app.R;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    List<SlideModel>slideModelList;
    List<SlideModel>slideModelList1;
    ImageSlider imageSlider, imageSlider1;

    @Override
    public void onBackPressed() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }

        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        imageSlider=(ImageSlider)findViewById(R.id.image_slider);
        imageSlider1=(ImageSlider)findViewById(R.id.image_slider1);

        addImages();

    }

    void addImages()
    {
        slideModelList=new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.p1, "Rice recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p2, "chicken recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p3, "seafood recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p4, "roll recipes", ScaleTypes.CENTER_CROP ));
        imageSlider.setImageList(slideModelList,ScaleTypes.FIT);

        slideModelList1=new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.p1, "Rice recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p2, "chicken recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p3, "seafood recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p4, "roll recipes", ScaleTypes.CENTER_CROP ));
        imageSlider1.setImageList(slideModelList1,ScaleTypes.FIT);
    }

    public void ViewAll(View view) {

        Intent intent=new Intent(Dashboard.this,MainActivity.class);

        switch (view.getId()){
            case R.id.recipe1:
                intent.putExtra("condition", 1);
                break;
            case R.id.recipe2:
                intent.putExtra("condition", 2);
                break;
        }

        startActivity(intent);
    }
}