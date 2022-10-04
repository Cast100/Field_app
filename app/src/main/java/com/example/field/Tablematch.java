package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.Table_adapter;
import com.example.field.Adapters.table_info;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tablematch extends Fragment {


    private ViewPager pager;
    private TabLayout tabLayout;
    private RecyclerView recyclerView;
    private List<table_info> info;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;
        view = inflater.inflate(R.layout.fragment_tablematch, container, false);
        recyclerView = view.findViewById(R.id.table_results);
        Table_adapter results = new Table_adapter(getContext(),info);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(results);
        //recyclerView.setDrawingCacheEnabled(true);
        //recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        info = new ArrayList<>();
        info.add(new table_info("1","Kcca","38","32","2","4","93","72","98",R.drawable.kcca));
        info.add(new table_info("2","Police","38","32","2","4","32","72","98",R.drawable.police));
        info.add(new table_info("3","Onduparaka","38","32","2","4","32","72","98",R.drawable.onduparaka));
        info.add(new table_info("4","Viper","38","32","2","4","32","72","98",R.drawable.vipers));
        info.add(new table_info("5","Villa","38","32","2","4","32","72","98",R.drawable.villa));
        info.add(new table_info("6","Paidha","38","32","2","4","32","72","98",R.drawable.paidha_logo));
        info.add(new table_info("7","Simba","38","32","2","4","32","72","98",R.drawable.simba));
        info.add(new table_info("8","Nyamityobora","38","32","2","4","32","72","98",R.drawable.nyamityobora_logo));
        info.add(new table_info("9","Bright \n Star","38","32","2","4","32","72","98",R.drawable.bright));
        info.add(new table_info("10","Ndejje","38","32","2","4","32","72","98",R.drawable.ndejje));
        info.add(new table_info("11","Proline","38","32","2","4","32","72","98",R.drawable.proline));
    }
}
