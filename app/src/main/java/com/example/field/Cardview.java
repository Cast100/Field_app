package com.example.field;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Cardview extends RecyclerView.Adapter<Cardview.MyViewHolder> {

    private Context mContext;
    private List<Soccer> mData;

    public Cardview(Context mContext, List<Soccer> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater lnflater = LayoutInflater.from(mContext);
        view = lnflater.inflate(R.layout.cardviewers,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder Holder, final int position) {

        Holder.tv_soccer.setText(mData.get(position).getTitle());
        Holder.img_soccer.setImageResource(mData.get(position).getThumbnail());
         Holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, com.example.field.Adapters.SoccerActivity.class);

                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("thumbnail",mData.get(position).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_soccer;
        ImageView img_soccer;
        CardView cardview;

        public MyViewHolder(View view) {
            super(view);
            tv_soccer = (TextView) itemView.findViewById(R.id.title);
            img_soccer = (ImageView) itemView.findViewById(R.id.nail);
            cardview = (CardView) itemView.findViewById(R.id.cards);
        }
    }
}
