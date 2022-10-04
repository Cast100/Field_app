package com.example.field.Adapters;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

public class league_adapter extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView txt;
    ImageView img;
    ItemClicklistener itemClicklistener;


    league_adapter(@NonNull View itemView) {
        super(itemView);

        this.txt = itemView.findViewById(R.id.txt_league);
        this.img = itemView.findViewById(R.id.imgs);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClicklistener.onItemClickListener(v,getLayoutPosition());
    }

    public  void  setItemClicklistener(ItemClicklistener ic){

        this.itemClicklistener = ic;
    }
}
