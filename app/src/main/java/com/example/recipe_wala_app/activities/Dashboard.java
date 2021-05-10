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
    List<SlideModel>slideModelList2;
    List<SlideModel>slideModelList3;
    List<SlideModel>slideModelList4;
    List<SlideModel>slideModelList5;
    ImageSlider imageSlider, imageSlider1, imageSlider2, imageSlider3, imageSlider4, imageSlider5;

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
        imageSlider2=(ImageSlider)findViewById(R.id.image_slider2);
        imageSlider3=(ImageSlider)findViewById(R.id.image_slider3);
        imageSlider4=(ImageSlider)findViewById(R.id.image_slider4);
        imageSlider5=(ImageSlider)findViewById(R.id.image_slider5);

        addImages();

    }

    void addImages()
    {
        slideModelList=new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.p1,"Chicken recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p6, "Beef recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p10, "Egg recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p14, "Pasta recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p1, "Lentil recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p2, "Broccoli recipes", ScaleTypes.CENTER_CROP ));
        slideModelList.add(new SlideModel(R.drawable.p4, "Spinach recipes", ScaleTypes.CENTER_CROP ));
        imageSlider.setImageList(slideModelList,ScaleTypes.FIT);

        slideModelList1=new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.p16, "Mediterranean recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p17, "Salad recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p18, "Keto recipes", ScaleTypes.CENTER_CROP ));
        slideModelList1.add(new SlideModel(R.drawable.p19, "Low Carb recipes", ScaleTypes.CENTER_CROP ));
        imageSlider1.setImageList(slideModelList1,ScaleTypes.FIT);

        slideModelList2=new ArrayList<>();
        slideModelList2.add(new SlideModel(R.drawable.p10, "Indian recipes", ScaleTypes.CENTER_CROP ));
        slideModelList2.add(new SlideModel(R.drawable.p22, "American recipes", ScaleTypes.CENTER_CROP ));
        slideModelList2.add(new SlideModel(R.drawable.p24, "Chinese recipes", ScaleTypes.CENTER_CROP ));
        slideModelList2.add(new SlideModel(R.drawable.p26, "French recipes", ScaleTypes.CENTER_CROP ));
        slideModelList2.add(new SlideModel(R.drawable.p28, "Japanese recipes", ScaleTypes.CENTER_CROP ));
        imageSlider2.setImageList(slideModelList2,ScaleTypes.FIT);

        slideModelList3=new ArrayList<>();
        slideModelList3.add(new SlideModel(R.drawable.p29, "Special occasion recipes", ScaleTypes.CENTER_CROP ));
        slideModelList3.add(new SlideModel(R.drawable.p31, "Causal occasion recipes", ScaleTypes.CENTER_CROP ));
        slideModelList3.add(new SlideModel(R.drawable.p35, "BBQ recipes", ScaleTypes.CENTER_CROP ));
        slideModelList3.add(new SlideModel(R.drawable.p39, "Bruch recipes", ScaleTypes.CENTER_CROP ));
        slideModelList3.add(new SlideModel(R.drawable.p41, "Weekend recipes", ScaleTypes.CENTER_CROP ));
        imageSlider3.setImageList(slideModelList3,ScaleTypes.FIT);

        slideModelList4=new ArrayList<>();
        slideModelList4.add(new SlideModel(R.drawable.p42, "Mizu Yokan recipe", ScaleTypes.CENTER_CROP ));
        slideModelList4.add(new SlideModel(R.drawable.p43, "Blueberry Lemonade Pie recipe", ScaleTypes.CENTER_CROP ));
        slideModelList4.add(new SlideModel(R.drawable.p44, "French Blueberry Pie recipe", ScaleTypes.CENTER_CROP ));
        slideModelList4.add(new SlideModel(R.drawable.p45, "Chinese Almond Float recipe", ScaleTypes.CENTER_CROP ));
        imageSlider4.setImageList(slideModelList4,ScaleTypes.FIT);

        slideModelList5=new ArrayList<>();
        slideModelList5.add(new SlideModel(R.drawable.p46, "Rose Simple Syrup recipe", ScaleTypes.CENTER_CROP ));
        slideModelList5.add(new SlideModel(R.drawable.p47, "Original Irish Coffee recipe", ScaleTypes.CENTER_CROP ));
        slideModelList5.add(new SlideModel(R.drawable.p48, "Pomegranate Tequila Sunrise Mimosas recipe", ScaleTypes.CENTER_CROP ));
        slideModelList5.add(new SlideModel(R.drawable.p49, "Frozen Kappa Colada Cocktail recipe", ScaleTypes.CENTER_CROP ));
        imageSlider5.setImageList(slideModelList5,ScaleTypes.FIT);
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
            case R.id.recipe3:
                intent.putExtra("condition", 3);
                break;
            case R.id.recipe4:
                intent.putExtra("condition", 4);
                break;
            case R.id.recipe5:
                intent.putExtra("condition", 5);
                break;
            case R.id.recipe6:
                intent.putExtra("condition", 6);
                break;
        }

        startActivity(intent);
    }
}