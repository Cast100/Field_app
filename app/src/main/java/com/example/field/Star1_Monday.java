package com.example.field;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Star1_Monday extends AppCompatActivity {

    private TabLayout tab;
    private AppBarLayout appBar;
    private ViewPager viewpage;
    private ImageView bk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star1__monday);

        tab = (TabLayout) findViewById(R.id.out_id);
        appBar = (AppBarLayout) findViewById(R.id.app_id);
        viewpage = (ViewPager) findViewById(R.id.soc_id);
        bk = findViewById(R.id.backspace_id);

        viewpageAdapter  pageadapter = new viewpageAdapter(getSupportFragmentManager());
        pageadapter.AddFragment(new MatchFacts(),"Match Facts");
        pageadapter.AddFragment(new Stat(),"STATS");
        pageadapter.AddFragment(new HeadtoHead(),"Head-To-Head");
        pageadapter.AddFragment(new LineUp(),"LineUp");

        viewpage.setAdapter(pageadapter);
        tab.setupWithViewPager(viewpage);

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Navlayout.class);
                startActivity(intent);
            }
        });

    }
}
