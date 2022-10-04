package com.example.field;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class News extends Fragment {


    View fragment;
    AppBarLayout bar;
    ViewPager viewers;
    TabLayout layouts;

    // toolnews

    DrawerLayout drawer;
    ActionBarDrawerToggle action;
    Toolbar tools;

    public News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragment = inflater.inflate(R.layout.fragment_news, container, false);
         bar = fragment.findViewById(R.id.line_id);
          viewers = fragment.findViewById(R.id.news_id);
          layouts = fragment.findViewById(R.id.Tabs_id);
        ///toolnews

        return fragment;
    }

    private void setSupportActionBar(Toolbar tools) {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         setAdapter(viewers);
         layouts.setupWithViewPager(viewers);

         layouts.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });
    }

    private void setAdapter(ViewPager viewers) {

        viewpagerNews Adapters = new viewpagerNews(getChildFragmentManager());

        Adapters.Fragment(new NewzFragment(),"News");
        Adapters.Fragment(new ChampionFragment(),"Champions");
        Adapters.Fragment(new TransferFragment(),"Transfers");
        Adapters.Fragment(new VideosFragment(),"Videos");

        viewers.setAdapter(Adapters);
    }
}
