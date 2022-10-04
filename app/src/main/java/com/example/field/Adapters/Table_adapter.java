package com.example.field.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

import java.util.List;

public class Table_adapter extends RecyclerView.Adapter<Table_adapter.MyHolder>  {

      Context mcontext;
      List<table_info> data;

    public Table_adapter(Context mcontext, List<table_info> data) {
        this.mcontext = mcontext;
        this.data = data;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tablayout_tb,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder hold, int position) {

        table_info infro = data.get(position);

        hold.position_txt.setText(infro.getPosition());
        hold.team_txt.setText(infro.getTeam());
        hold.PI_txt.setText(infro.getPI());
        hold.W_txt.setText(infro.getW());
        hold.D_txt.setText(infro.getD());
        hold.L_txt.setText(infro.getL());
        hold.DF_txt.setText(infro.getDf());
        hold.GD_txt.setText(infro.getGd());
        hold.P_txt.setText(infro.getPts());
        //hold.img.setImageResource(infro.getImg());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  static class MyHolder extends RecyclerView.ViewHolder{

         TextView position_txt;
         TextView team_txt;
         TextView PI_txt;
         TextView W_txt;
         TextView  D_txt;
         TextView  L_txt;
         TextView  DF_txt;
         TextView  GD_txt;
        TextView  P_txt;
         ImageView  img;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            position_txt = itemView.findViewById(R.id.position);
            team_txt = itemView.findViewById(R.id.tms);
            PI_txt = itemView.findViewById(R.id.PI);
            W_txt = itemView.findViewById(R.id.win);
            D_txt = itemView.findViewById(R.id.dual);
            L_txt = itemView.findViewById(R.id.loss);
            DF_txt = itemView.findViewById(R.id.games);
            GD_txt = itemView.findViewById(R.id.gd);
            P_txt = itemView.findViewById(R.id.points);
            img = itemView.findViewById(R.id.flag_id);
        }
    }
}
