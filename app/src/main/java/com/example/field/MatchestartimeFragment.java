package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchestartimeFragment extends Fragment {




    public  static Tablestartime newInstance (){

        return new Tablestartime();
    }
    public MatchestartimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View roots = inflater.inflate(R.layout.fragment_matchestartime,null);


        return  roots;
    }

}
