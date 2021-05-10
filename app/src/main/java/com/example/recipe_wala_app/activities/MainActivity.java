package com.example.recipe_wala_app.activities;

import  androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import com.example.recipe_wala_app.R;
import com.example.recipe_wala_app.adapter.CustomAdapter;
import com.example.recipe_wala_app.model.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

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

        else if (condition==3)
        {
            recipe3();
        }

        else if (condition==4)
        {
            recipe4();
        }

        else if (condition==5)
        {
            recipe5();
        }

        else if (condition==6)
        {
            recipe6();
        }

        customAdapter=new CustomAdapter(MainActivity.this,constantList);
        gridView.setAdapter(customAdapter);
    }

    private void recipe1()
    {
        constantList.add(new Constant(R.drawable.p1,getResources().getString(R.string.t1),getResources().getString(R.string.i1),getResources().getString(R.string.r1)));
        constantList.add(new Constant(R.drawable.p2,getResources().getString(R.string.t2),getResources().getString(R.string.i2),getResources().getString(R.string.r2)));
        constantList.add(new Constant(R.drawable.p3,getResources().getString(R.string.t3),getResources().getString(R.string.i3),getResources().getString(R.string.r3)));
        constantList.add(new Constant(R.drawable.p4,getResources().getString(R.string.t4),getResources().getString(R.string.i4),getResources().getString(R.string.r4)));
        constantList.add(new Constant(R.drawable.p5,getResources().getString(R.string.t5),getResources().getString(R.string.i5),getResources().getString(R.string.r5)));
        constantList.add(new Constant(R.drawable.p6,getResources().getString(R.string.t6),getResources().getString(R.string.i6),getResources().getString(R.string.r6)));
        constantList.add(new Constant(R.drawable.p7,getResources().getString(R.string.t7),getResources().getString(R.string.i7),getResources().getString(R.string.r7)));
        constantList.add(new Constant(R.drawable.p8,getResources().getString(R.string.t8),getResources().getString(R.string.i8),getResources().getString(R.string.r8)));
        constantList.add(new Constant(R.drawable.p9,getResources().getString(R.string.t9),getResources().getString(R.string.i9),getResources().getString(R.string.r9)));
        constantList.add(new Constant(R.drawable.p10,getResources().getString(R.string.t10),getResources().getString(R.string.i10),getResources().getString(R.string.r10)));
        constantList.add(new Constant(R.drawable.p11,getResources().getString(R.string.t11),getResources().getString(R.string.i11),getResources().getString(R.string.r11)));
        constantList.add(new Constant(R.drawable.p12,getResources().getString(R.string.t12),getResources().getString(R.string.i12),getResources().getString(R.string.r12)));
        constantList.add(new Constant(R.drawable.p13,getResources().getString(R.string.t13),getResources().getString(R.string.i13),getResources().getString(R.string.r13)));
        constantList.add(new Constant(R.drawable.p14,getResources().getString(R.string.t14),getResources().getString(R.string.i14),getResources().getString(R.string.r14)));
        constantList.add(new Constant(R.drawable.p15,getResources().getString(R.string.t15),getResources().getString(R.string.i15),getResources().getString(R.string.r15)));
    }
    private void recipe2()
    {
        constantList.add(new Constant(R.drawable.p16,getResources().getString(R.string.t16),getResources().getString(R.string.i16),getResources().getString(R.string.r16)));
        constantList.add(new Constant(R.drawable.p17,getResources().getString(R.string.t17),getResources().getString(R.string.i17),getResources().getString(R.string.r17)));
        constantList.add(new Constant(R.drawable.p18,getResources().getString(R.string.t18),getResources().getString(R.string.i18),getResources().getString(R.string.r18)));
        constantList.add(new Constant(R.drawable.p19,getResources().getString(R.string.t19),getResources().getString(R.string.i19),getResources().getString(R.string.r19)));
    }
    private void recipe3()
    {

        constantList.add(new Constant(R.drawable.p20,getResources().getString(R.string.t20),getResources().getString(R.string.i20),getResources().getString(R.string.r20)));
        constantList.add(new Constant(R.drawable.p21,getResources().getString(R.string.t21),getResources().getString(R.string.i21),getResources().getString(R.string.r21)));
        constantList.add(new Constant(R.drawable.p22,getResources().getString(R.string.t22),getResources().getString(R.string.i22),getResources().getString(R.string.r22)));
        constantList.add(new Constant(R.drawable.p23,getResources().getString(R.string.t23),getResources().getString(R.string.i23),getResources().getString(R.string.r23)));
        constantList.add(new Constant(R.drawable.p24,getResources().getString(R.string.t24),getResources().getString(R.string.i24),getResources().getString(R.string.r24)));
        constantList.add(new Constant(R.drawable.p25,getResources().getString(R.string.t25),getResources().getString(R.string.i25),getResources().getString(R.string.r25)));
        constantList.add(new Constant(R.drawable.p26,getResources().getString(R.string.t26),getResources().getString(R.string.i26),getResources().getString(R.string.r26)));
        constantList.add(new Constant(R.drawable.p27,getResources().getString(R.string.t27),getResources().getString(R.string.i27),getResources().getString(R.string.r27)));
        constantList.add(new Constant(R.drawable.p28,getResources().getString(R.string.t28),getResources().getString(R.string.i28),getResources().getString(R.string.r28)));
        constantList.add(new Constant(R.drawable.p29,getResources().getString(R.string.t29),getResources().getString(R.string.i29),getResources().getString(R.string.r29)));
        constantList.add(new Constant(R.drawable.p30,getResources().getString(R.string.t30),getResources().getString(R.string.i30),getResources().getString(R.string.r30)));
        constantList.add(new Constant(R.drawable.p31,getResources().getString(R.string.t31),getResources().getString(R.string.i31),getResources().getString(R.string.r31)));


    }
    private void recipe4()
    {

        constantList.add(new Constant(R.drawable.p32,getResources().getString(R.string.t32),getResources().getString(R.string.i32),getResources().getString(R.string.r32)));
        constantList.add(new Constant(R.drawable.p33,getResources().getString(R.string.t33),getResources().getString(R.string.i33),getResources().getString(R.string.r33)));
        constantList.add(new Constant(R.drawable.p34,getResources().getString(R.string.t34),getResources().getString(R.string.i34),getResources().getString(R.string.r34)));
        constantList.add(new Constant(R.drawable.p35,getResources().getString(R.string.t35),getResources().getString(R.string.i35),getResources().getString(R.string.r35)));
        constantList.add(new Constant(R.drawable.p36,getResources().getString(R.string.t36),getResources().getString(R.string.i36),getResources().getString(R.string.r36)));
        constantList.add(new Constant(R.drawable.p37,getResources().getString(R.string.t37),getResources().getString(R.string.i37),getResources().getString(R.string.r37)));
        constantList.add(new Constant(R.drawable.p38,getResources().getString(R.string.t38),getResources().getString(R.string.i38),getResources().getString(R.string.r38)));
        constantList.add(new Constant(R.drawable.p39,getResources().getString(R.string.t39),getResources().getString(R.string.i39),getResources().getString(R.string.r39)));
        constantList.add(new Constant(R.drawable.p40,getResources().getString(R.string.t40),getResources().getString(R.string.i40),getResources().getString(R.string.r40)));
        constantList.add(new Constant(R.drawable.p41,getResources().getString(R.string.t41),getResources().getString(R.string.i41),getResources().getString(R.string.r41)));


    }
    private void recipe5()
    {

        constantList.add(new Constant(R.drawable.p42,getResources().getString(R.string.t42),getResources().getString(R.string.i42),getResources().getString(R.string.r42)));
        constantList.add(new Constant(R.drawable.p43,getResources().getString(R.string.t43),getResources().getString(R.string.i43),getResources().getString(R.string.r43)));
        constantList.add(new Constant(R.drawable.p44,getResources().getString(R.string.t44),getResources().getString(R.string.i44),getResources().getString(R.string.r44)));
        constantList.add(new Constant(R.drawable.p45,getResources().getString(R.string.t45),getResources().getString(R.string.i45),getResources().getString(R.string.r45)));

    }
    private void recipe6()
    {

        constantList.add(new Constant(R.drawable.p46,getResources().getString(R.string.t42),getResources().getString(R.string.i42),getResources().getString(R.string.r42)));
        constantList.add(new Constant(R.drawable.p47,getResources().getString(R.string.t43),getResources().getString(R.string.i43),getResources().getString(R.string.r43)));
        constantList.add(new Constant(R.drawable.p48,getResources().getString(R.string.t44),getResources().getString(R.string.i44),getResources().getString(R.string.r44)));
        constantList.add(new Constant(R.drawable.p49,getResources().getString(R.string.t45),getResources().getString(R.string.i45),getResources().getString(R.string.r45)));

    }
}















