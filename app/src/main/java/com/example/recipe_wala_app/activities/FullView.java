package com.example.recipe_wala_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipe_wala_app.R;

public class FullView extends AppCompatActivity {

     Intent intent;
     String title;
     String ingredient;
     String recipe;
     int image;

    TextView titleTxt,ingredientTitle,ingredientTxt,recipeTitle,recipeTxt;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        titleTxt=(TextView)findViewById(R.id.titleFullView);
        ingredientTitle=(TextView)findViewById(R.id.ingredientTitle);
        ingredientTxt=(TextView)findViewById(R.id.ingredient);
        recipeTitle=(TextView)findViewById(R.id.recipeTitle);
        recipeTxt=(TextView)findViewById(R.id.recipe);
        imageView=(ImageView)findViewById(R.id.thumbnailFullView);

        intent=getIntent();

        image= getIntent().getIntExtra("image", 00);
        title=intent.getStringExtra( "title");
        ingredient=intent.getStringExtra( "ingredients");
        recipe=intent.getStringExtra( "recipe");


        imageView.setImageResource(image);

        titleTxt.setText(title);
        ingredientTitle.setText("INGREDIENTS:");
        ingredientTxt.setText(ingredient);
        recipeTitle.setText("RECIPE:");
        recipeTxt.setText(recipe);


    }
}