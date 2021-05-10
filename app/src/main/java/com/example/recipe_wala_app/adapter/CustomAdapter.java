package com.example.recipe_wala_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.recipe_wala_app.R;
import com.example.recipe_wala_app.activities.FullView;
import com.example.recipe_wala_app.activities.MainActivity;
import com.example.recipe_wala_app.model.Constant;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Constant>constantList;

    public CustomAdapter(Context context, List<Constant> constantList) {
        this.context = context;
        this.constantList = constantList;
    }

    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);

        final String title=constantList.get(i).getTitle();
        final String ingredient=constantList.get(i).getIngredient();
        final String recipe=constantList.get(i).getRecipe();
        final int image=constantList.get(i).getImage();

        ImageView imageView=(ImageView)view.findViewById(R.id.thumbnail);
        TextView textView=(TextView)view.findViewById(R.id.title);
        CardView cardView=(CardView)view.findViewById(R.id.cardView);

        imageView.setImageResource(image);
        textView.setText(title);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, FullView.class);
                intent.putExtra( "image",image);
                intent.putExtra( "title",title);
                intent.putExtra( "ingredients",ingredient);
                intent.putExtra( "recipe",recipe);
                context.startActivity(intent);
            }
        });



        return view;
    }
}
