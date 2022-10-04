package com.example.field.Adapters;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;


public class MyFolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public  TextView txt;
    public ImageView imgs;

    ItemClicklistener itemClicklistener;

    public MyFolder(@NonNull View itemView) {
        super(itemView);

        this.imgs = itemView.findViewById(R.id.title);
        this.txt = itemView.findViewById(R.id.nail);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClicklistener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClicklistener(ItemClicklistener itc){

        this.itemClicklistener = itc;
    }

    }

