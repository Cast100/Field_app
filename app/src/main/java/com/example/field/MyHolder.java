package com.example.field;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.ItemClicklistener;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    public TextView mtxt;
    public ImageView img;
    ItemClicklistener itemClicklistener;

     public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mtxt = itemView.findViewById(R.id.txt_league);
        this.img = itemView.findViewById(R.id.imgs);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        this.itemClicklistener.onItemClickListener(v, getLayoutPosition());

    }

    public void setItemClicklistener(ItemClicklistener ic){

        this.itemClicklistener = ic;
    }
}
