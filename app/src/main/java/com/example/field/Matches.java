package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Matches extends Fragment {

    View Fragmentmatch;





    public Matches() {
        // Required empty public constructor
    }

    public  static Matches getInstance(){

        return new Matches();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       Fragmentmatch = inflater.inflate(R.layout.fragment_matches, container, false);


       return Fragmentmatch;
    }



}
