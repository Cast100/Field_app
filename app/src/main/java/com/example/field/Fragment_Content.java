package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Content extends Fragment {

     private  static  final String KEY_TITLE="Contetn";
    public Fragment_Content() {
        // Required empty public constructor
    }

    public  static Fragment_Content newInstance(String param1, String param2){
        Fragment_Content fragment = new Fragment_Content();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE,param1);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment__content, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        String title = getArguments().getString(KEY_TITLE);
        ((TextView)view.findViewById(R.id.txt_title)).setText(title);

        super.onViewCreated(view, savedInstanceState);
    }
}
