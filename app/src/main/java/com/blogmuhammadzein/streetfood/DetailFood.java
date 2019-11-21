package com.blogmuhammadzein.streetfood;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFood extends AppCompatActivity {
    ImageView imgfood;
    TextView detailfood,judulfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setTitle(getIntent().getStringExtra("judula"));

        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgfood = findViewById(R.id.imgDetail);
        detailfood = findViewById(R.id.txtDetail);
        judulfood = findViewById(R.id.txtJudul);

        detailfood.setText(getIntent().getStringExtra("detaila"));
        judulfood.setText(getIntent().getStringExtra("judula"));
        Glide.with(this).load(getIntent().getIntExtra("gambara", 0)).into(imgfood);
    }

}
