package com.blogmuhammadzein.streetfood;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterFood extends RecyclerView.Adapter<AdapterFood.ViewHolder> {
    Context context;
    int[] gambarFood;
    String[] namaFood, detailFood, judulFood;

    //
    public AdapterFood(Context context, int[] gambarFood, String[] namaFood, String[] detailFood, String[] judulFood) {
        this.context = context;
        this.gambarFood = gambarFood;
        this.namaFood = namaFood;
        this.detailFood = detailFood;
        this.judulFood = judulFood;
    }

    //
    @NonNull
    @Override
    public AdapterFood.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txt.setText(namaFood[i]);
        Glide.with(context)
                .load(gambarFood[i])
                .into(viewHolder.img);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent move = new Intent(context, DetailFood.class);
                move.putExtra("gambara", gambarFood[i]);
                move.putExtra("detaila", detailFood[i]);
                move.putExtra("judula", judulFood[i]);
                context.startActivity(move);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarFood.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt, judul;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgFood);
            txt = itemView.findViewById(R.id.txtFood);
            judul = itemView.findViewById(R.id.txtJudul);
        }
    }
}
