package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.Teamz;


/**
 * A simple {@link Fragment} subclass.
 */
public class MondayFragment extends Fragment {

    View view;

      RecyclerView mRecyclerview;
      Teamz adap;
      //List<teamlist> mt;

    public MondayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_monday,container,false);

        return view;
    }


}
