package com.example.field;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.field.Adapters.leag_adpt;
import com.example.field.Adapters.leagues;

import java.util.ArrayList;
import java.util.List;

public class league_follow extends AppCompatActivity {

    private RecyclerView RV;
    private List<leagues> ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_follow);

        RV = findViewById(R.id.fav_id);
        leag_adpt adpt = new leag_adpt(this,ad);
        RV.setLayoutManager(new GridLayoutManager(this,3));
        RV.setAdapter(adpt);

        ad = new ArrayList<>();
        ad.add(new leagues(R.drawable.star, "StarTimes\n league"));
        ///cardView = view.findViewById(id.follow_id);
        ad.add(new leagues(R.drawable.up, "Super league"));
        ad.add(new leagues(R.drawable.images, "University\n league"));
        ad.add(new leagues(R.drawable.imagez, "Amasaza"));
        ad.add(new leagues(R.drawable.drum, " Drum\n Tournament"));
        ad.add(new leagues(R.drawable.supers, "Women\n Super"));
        ad.add(new leagues(R.drawable.stanbic, "Stanbic Cup"));
        ad.add(new leagues(R.drawable.fufa, "Women Elite\n league"));
        ad.add(new leagues(R.drawable.stanbic, "Women's \n Cup"));
        ad.add(new leagues(R.drawable.junior, "Juniors\n (U-17)"));
    }
}