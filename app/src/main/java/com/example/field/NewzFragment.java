package com.example.field;


import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.field.Adapters.Model;
import com.example.field.Adapters.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewzFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    View fragment;

   private TextView txt;
   private RecyclerView recyclerView;
   private List<Model> lstdetails;
   private SwipeRefreshLayout swipeRefreshLayout;
    public NewzFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragment = inflater.inflate(R.layout.fragment_newz, container, false);
        txt = (TextView) fragment.findViewById(R.id.head_id);

        recyclerView = (RecyclerView) fragment.findViewById(R.id.view_id);
        recyclerView.setHasFixedSize(true);
       RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getContext(), lstdetails);
        recyclerAdapter.setHasStableIds(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       recyclerView.setAdapter(recyclerAdapter);

       init();
       return  fragment;
    }

    private void init() {


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        swipeRefreshLayout = fragment.findViewById(R.id.swiper_id);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },3000);
            }
        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        lstdetails = new ArrayList<>();
        lstdetails.add(new Model(R.drawable.fielder, "The 21 year old who can also play as a forward recently crossed to Odense" +
                " Boldklub in the Danish Premier League"));
        lstdetails.add(new Model(R.drawable.fielder, "League"));
        lstdetails.add(new Model(R.drawable.fielder, "The 21 year old who can also play as a forward recently crossed to Odense" +
                " Boldklub in the Danish Premier League"));

    }

    @Override
    public void onRefresh() {

    }
}
