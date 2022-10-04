package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TablestartimeFragment extends Fragment {

    View myfragment;


    public TablestartimeFragment() {
        // Required empty public constructor
    }

     public  static Tablestartime newInstance (){

            return new Tablestartime();
     }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myfragment = inflater.inflate(R.layout.fragment_tablestartime,container,false);


        return  myfragment;
    }



}
