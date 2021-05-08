package com.example.recipe_wala_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.example.recipe_wala_app.R;
import com.example.recipe_wala_app.adapter.CustomAdapter;
import com.example.recipe_wala_app.model.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int condition;
    Intent intent;

    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant>constantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        constantList=new ArrayList<>();


        intent =getIntent();
        condition=intent.getIntExtra("condition",00);

        if(condition==1)
        {
            recipe1();

        }
        else if (condition==2)
        {
            recipe2();
        }

        customAdapter=new CustomAdapter(MainActivity.this, constantList);
        gridView.setAdapter(customAdapter);
    }


    void recipe2()
    {
        constantList.add(new Constant(R.drawable.p1,"biryani","", ""));
        constantList.add(new Constant(R.drawable.p2,"parota","", ""));
        constantList.add(new Constant(R.drawable.p3,"aloo mutter","", ""));
        constantList.add(new Constant(R.drawable.p4,"gobi","", ""));
        constantList.add(new Constant(R.drawable.p5,"friedrice","", ""));
    }
    private void recipe1() {

        constantList.add(new Constant(R.drawable.chicken,"Classic Chicken Broast","", ""));
        constantList.add(new Constant(R.drawable.afghani,"Afghani Pulov","", ""));
        constantList.add(new Constant(R.drawable.lemonpepper,"Lemon Pepper Chicken Wings","", ""));
        constantList.add(new Constant(R.drawable.keto,"Keto Chicken Salad","", ""));

    }
}