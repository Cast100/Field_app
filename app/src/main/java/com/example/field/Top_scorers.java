package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.Recycler_score;
import com.example.field.Adapters.scorers_info;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Top_scorers extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private  List<scorers_info> details;

    public Top_scorers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_top_scorers, container, false);
        recyclerView = v.findViewById(R.id.score_id);
        Recycler_score Score = new Recycler_score(getContext(),details);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(Score);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        details = new ArrayList<>();
        details.add(new scorers_info("Emmanuel Okwi","Kcca","55",R.drawable.okello,R.drawable.kcca));
        details.add(new scorers_info("Emma Okwi","Kcca","45",R.drawable.denis,R.drawable.kcca));
        details.add(new scorers_info("Emma paul ","Kcca","44",R.drawable.erisa,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","30",R.drawable.miya,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","30",R.drawable.shaban,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","20",R.drawable.patrick,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","30",R.drawable.paul,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","20",R.drawable.okwi,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","30",R.drawable.okello,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","20",R.drawable.okello,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","30",R.drawable.okello,R.drawable.kcca));
        details.add(new scorers_info("Emmanuel Okwi","Kcca","20",R.drawable.okello,R.drawable.kcca));

    }
}
