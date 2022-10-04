package com.example.field.Adapters;

import android.media.Image;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

public class Holder_Team extends RecyclerView.ViewHolder {

    ImageView Imgs;
    TextView title;
    TextView team;
    ImageView imgs_time;
    TextView Teamsoccer;
    ImageView images;
    TextView teamVs;

    public Holder_Team(@NonNull View itemView) {
        super(itemView);

        this.Imgs = itemView.findViewById(R.id.circle_id);
        this.title = itemView.findViewById(R.id.leagtitle);
        this.team = itemView.findViewById(R.id.match);
        this.imgs_time = itemView.findViewById(R.id.image_team);
        this.Teamsoccer = itemView.findViewById(R.id.soccer);
        this.images = itemView.findViewById(R.id.imag_team2);
        this.teamVs = itemView.findViewById(R.id.match2);
    }
}
