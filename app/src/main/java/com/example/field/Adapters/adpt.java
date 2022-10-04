package com.example.field.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

import java.util.List;

public class adpt extends RecyclerView.Adapter<adpt.MyHoler> {

    Context mcontext;
    List<leagues> Data;

    public adpt(Context mcontext, List<leagues> Data) {
        this.mcontext = mcontext;
        this.Data = Data;
    }

    @NonNull
    @Override
    public MyHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(mcontext).inflate(R.layout.design_team,parent,false);
        MyHoler holer = new MyHoler(v);

        return holer;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHoler holder, int position) {

        holder.tx.setText(Data.get(position).getName());
        holder.img.setImageResource(Data.get(position).getImages());


    }

    @Override
    public int getItemCount() {
        return  Data.size();
    }

    public static class MyHoler extends RecyclerView.ViewHolder{

        private TextView tx;
        private ImageView img;
        private CardView card;
        private TextView txt_view;
        private LinearLayout layout;
        public MyHoler(@NonNull View itemView) {
            super(itemView);

            tx =(TextView) itemView.findViewById(R.id.name);
            img = (ImageView) itemView.findViewById(R.id.detail);
            card = itemView.findViewById(R.id.cards_id);
            // txt_view = itemView.findViewById(R.id.follow_id);
            // layout = itemView.findViewById(R.id.layout_id);
        }
    }
}
