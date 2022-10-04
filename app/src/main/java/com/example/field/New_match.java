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
import com.example.field.Adapters.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class New_match extends Fragment {

    private TextView txt;
    private RecyclerView recyclerView;
    private List<Model>details;
    View v;
    public New_match() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v =  inflater.inflate(R.layout.fragment_new_match, container, false);
        txt = v.findViewById(R.id.head_id);
        recyclerView =  v.findViewById(R.id.new_id);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getContext(),details);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        details = new ArrayList<>();
        details.add(new Model(R.drawable.denis, "Goals"));
        details.add(new Model(R.drawable.okello, "League"));
        details.add(new Model(R.drawable.erisa, "Description"));
        details.add(new Model(R.drawable.erisa, "Description"));
    }
}
