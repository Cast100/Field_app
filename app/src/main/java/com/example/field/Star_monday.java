package com.example.field;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Star_monday extends AppCompatActivity {

    private TabLayout tab;
    private AppBarLayout appBar;
    private ViewPager viewpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_monday);


        tab = (TabLayout) findViewById(R.id.out_id);
        appBar = (AppBarLayout) findViewById(R.id.app_id);
        viewpage = (ViewPager) findViewById(R.id.soc_id);

        viewpageAdapter  pageadapter = new viewpageAdapter(getSupportFragmentManager());
        pageadapter.AddFragment(new MatchFacts(),"Match Facts");
        pageadapter.AddFragment(new Stat(),"STATS");
        pageadapter.AddFragment(new HeadtoHead(),"Head-To-Head");

        viewpage.setAdapter(pageadapter);
        tab.setupWithViewPager(viewpage);

    }
}
