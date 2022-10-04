package com.example.field;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.info;
import com.example.field.Adapters.player_adapter;

import java.util.ArrayList;
import java.util.List;

import static com.example.field.R.id.view_id;


/**
 * A simple {@link Fragment} subclass.
 */
public class Player extends Fragment {

    View view;
    private RecyclerView recyclerView;
     List<info> ad;
     CardView cardView;
     ImageView imageView;
     LinearLayout layout;


    public Player() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            view = inflater.inflate(R.layout.fragment_player, container, false);
            recyclerView = view.findViewById(R.id.playerz_id);
            imageView = view.findViewById(R.id.detail);
            layout = view.findViewById(R.id.out);
            player_adapter adpt = new player_adapter(getContext(),ad);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
            recyclerView.setAdapter(adpt);


            return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ad = new ArrayList<>();
        ad.add(new info("Shaban","",R.drawable.player));
        ad.add(new info("Miya","",R.drawable.player));
        ad.add(new info("Okello","",R.drawable.player));
        ad.add(new info("Okwi","",R.drawable.player));
        ad.add(new info("Titto\n Okello","",R.drawable.player));

    }

}
