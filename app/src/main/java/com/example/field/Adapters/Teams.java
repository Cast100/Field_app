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

import java.util.ArrayList;
import java.util.List;

public class Teams extends RecyclerView.Adapter<Teams.MyViewHolder> {

    Context c;
    ArrayList<teamlist> mode;

    public Teams(Context c, ArrayList<teamlist> mode) {
        this.c = c;
        this.mode = mode;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(c).inflate(R.layout.monday_match,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

      holder.icons.setImageResource(mode.get(position).getImages());
      holder.title.setText(mode.get(position).getTitle());
      holder.team.setText(mode.get(position).getTeam());
      holder.images.setImageResource(mode.get(position).getIcon_team());
      holder.soccer.setText(mode.get(position).getSoccer());
      holder.pics.setImageResource(mode.get(position).getImage_team());
      holder.teams.setText(mode.get(position).getVs_team());
    }

    @Override
    public int getItemCount() {
        return mode.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView icons;
        public TextView title;
        public  TextView teams;
        public ImageView images;
        public TextView soccer;
        public ImageView pics;
        public TextView team;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            icons = (ImageView)itemView.findViewById(R.id.icons);
            title = (TextView) itemView.findViewById(R.id.title_league);
            team = (TextView)itemView.findViewById(R.id.team);
            images = (ImageView)itemView.findViewById(R.id.img_team);
            soccer = (TextView) itemView.findViewById(R.id.soccers);
            pics = (ImageView) itemView.findViewById(R.id.img_team2);
            teams =  (TextView)itemView.findViewById(R.id.team2);
        }
    }
}
