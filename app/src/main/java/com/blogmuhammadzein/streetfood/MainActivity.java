package com.blogmuhammadzein.streetfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.synnapps.carouselview.CarouselView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvfood;
    String[] namaa, detaila,judula;
    int[] gambara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvfood = findViewById(R.id.streetfood);

        rvfood.setHasFixedSize(true);

        rvfood.setLayoutManager(new LinearLayoutManager(this));
        judula = getResources().getStringArray(R.array.judul);
        namaa = getResources().getStringArray(R.array.namafood);
        detaila = getResources().getStringArray(R.array.deskripsifood);
        gambara = new int[]{
                R.drawable.rice,
                R.drawable.satay,
                R.drawable.siomay,
                R.drawable.rendang,
                R.drawable.keraktelur,
                R.drawable.ketoprak,
                R.drawable.martabak,
                R.drawable.meatballs,
                R.drawable.gadogado,
                R.drawable.gulai,
        };

        AdapterFood adapter = new AdapterFood(MainActivity.this, gambara, namaa, detaila,judula);
        rvfood.setAdapter(adapter);
    }
}
