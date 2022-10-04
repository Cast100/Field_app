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

import com.example.field.Champ_win;
import com.example.field.R;
import com.example.field.Uni;

import java.util.List;

public class championAdapter  extends RecyclerView.Adapter<championAdapter.MyViewHolder> {

    Context mcontext;
    List<champ_adpt>mdata;

    public championAdapter(Context mcontext, List<champ_adpt> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewers,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        champ_adpt mod = mdata.get(position);

        holder.imgs.setImageResource(mod.getImages());
        holder.TxT.setText(mod.getTitle());




    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final Context mcontext;
        private TextView TxT;
        private ImageView imgs;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mcontext = itemView.getContext();
            TxT = (TextView)itemView.findViewById(R.id.title);
            imgs = (ImageView) itemView.findViewById(R.id.nail);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            final Intent intent;
            switch (getAdapterPosition()){

                case 0:
                    intent = new Intent(mcontext, Champ_win.class);
                    break;
                default:
                    intent = new Intent(mcontext, Uni.class);
            }
            mcontext.startActivity(intent);
        }
    }
}
