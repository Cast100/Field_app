package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.Model;
import com.example.field.Adapters.champ_adpt;
import com.example.field.Adapters.championAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChampionFragment extends Fragment {

        View fragment;
        private TextView textView;
        private RecyclerView recyclerView;
        private List<champ_adpt> details;
    public ChampionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragment = inflater.inflate(R.layout.fragment_champion, container, false);

        textView = (TextView) fragment.findViewById(R.id.head);
       recyclerView = (RecyclerView) fragment.findViewById(R.id.champion_detail);
        championAdapter adpt = new championAdapter(getContext(),details);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adpt);


        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        details =  new ArrayList<>();
        details.add(new Model(R.drawable.player, "The 21 year old who can also play as a forward recently crossed to Odense Boldklub in the Danish Premier League "));
        details.add(new Model(R.drawable.player, " 2018"));

    }
}
