package com.example.field.Adapters;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

public class teamView extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView team,teams,soccer,title;
        ImageView league,teamIcon,teamIcons;

        adapterteams adapt;
    public teamView(@NonNull View itemView) {
        super(itemView);

        this.league = itemView.findViewById(R.id.leagtitle);
        this.title = itemView.findViewById(R.id.title_league);
        this.team = itemView.findViewById(R.id.team);
        this.teamIcon = itemView.findViewById(R.id.image_team);
        this.soccer = itemView.findViewById(R.id.soccers);
        this.teamIcons = itemView.findViewById(R.id.img_team2);
        this.teams = itemView.findViewById(R.id.team2);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.adapt.onAdapterTeam(v,getLayoutPosition());
    }

    public  void  setAdaptTeamlistener(adapterteams ad){

        this.adapt = ad;
    }
}
