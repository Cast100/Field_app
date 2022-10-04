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

public class Recycler_score extends RecyclerView.Adapter<Recycler_score.MyViewHolder> {


    private Context mcontext;
    private List<scorers_info> mdata;

    public Recycler_score(Context mcontext, List<scorers_info> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sorers_design,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder hold, int position) {

         scorers_info inf = mdata.get(position);

         //hold.player_imgs.setImageResource(mdata.get(position).getPic());
        //hold.team_img.setImageResource(mdata.get(position).getProfile());
        hold.Name_txt.setText(inf.getName());
        hold.Team_txt.setText(inf.getTeam());
        hold.Score_txt.setText(inf.getScore());


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView Name_txt;
        private TextView Team_txt;
        private  TextView Score_txt;
        private ImageView player_imgs;
        private ImageView team_img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name_txt = itemView.findViewById(R.id.name_id);
            Team_txt = itemView.findViewById(R.id.tm_id);
            Score_txt = itemView.findViewById(R.id.number);
            player_imgs = itemView.findViewById(R.id.flag);
            team_img = itemView.findViewById(R.id.player_id);


        }
    }
}
