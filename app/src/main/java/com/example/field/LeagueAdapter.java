package com.example.field;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.myViewHolder> {

    private final LayoutInflater inflater;

    String[] title = {

            "Star Times League",
            "Super League",
            "University League",
            "Amasaza Cup",
            "Buganda Region"
    };
     int[] images ={

             R.drawable.star,
             R.drawable.star,
             R.drawable.up,
             R.drawable.kcca,
             R.drawable.buganda
     };

     public  LeagueAdapter(Context context,String[] object){

         inflater = LayoutInflater.from(context);
         this.title = object;
     }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view = inflater.inflate(R.layout.league_list,parent,false);
         myViewHolder Holder = new myViewHolder(view);

         return Holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {


         holder.tv_title.setText(title[position]);
         holder.tv_imgs.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public  class myViewHolder extends RecyclerView.ViewHolder{

         ImageView tv_imgs;
         TextView tv_title;
         RelativeLayout parentLayout;

        public myViewHolder(View itemView){
            super(itemView);

            tv_imgs = (ImageView) itemView.findViewById(R.id.imgs);
            tv_title = (TextView) itemView.findViewById(R.id.txt_league);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }
}
