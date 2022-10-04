package com.example.field;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class League extends Fragment {

    View fragments;
    AppBarLayout appBarLayout;
    ViewPager viewers;


    public League() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       fragments = inflater .inflate(R.layout.fragment_league, container, false);

       appBarLayout = fragments.findViewById(R.id.leg_id);
        ///viewers = fragments.findViewById(R.id.view_leg);
       return fragments;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
}
