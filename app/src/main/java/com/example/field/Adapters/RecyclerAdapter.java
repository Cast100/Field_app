package com.example.field.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.News_Recycler;
import com.example.field.R;
import com.example.field.Uni;
import com.example.field.friday_cardview;

import java.util.Collections;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

     Context mcontext;
     List<Model> mData ;

    public RecyclerAdapter(Context mcontext, List<Model> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewers,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder Holder, int position) {

        Model model = mData.get(position);

        Holder.txt.setText(model.getTitle());
        Holder.icon.setImageResource(model.getImgs());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final Context mcontext;
        private TextView txt;
        private ImageView icon;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mcontext = itemView.getContext();
            txt = (TextView) itemView.findViewById(R.id.title);
            icon = (ImageView) itemView.findViewById(R.id.nail);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            final Intent intent;
            switch (getAdapterPosition()){

                case 0:
                    intent = new Intent(mcontext, News_Recycler.class);
                    break;
                case 1:
                    intent = new Intent(mcontext, friday_cardview.class);
                    break;
                    default:
                        intent = new Intent(mcontext, Uni.class);
                        break;

            }
            mcontext.startActivity(intent);
        }
    }
}
