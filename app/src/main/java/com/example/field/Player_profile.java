package com.example.field;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.Prof_Adapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Player_profile extends AppCompatActivity {

    private TabLayout tab;
    private AppBarLayout appBar;
    private ViewPager viewpage;
    private ImageView bk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);

        tab = (TabLayout) findViewById(R.id.out_id);
        appBar = (AppBarLayout) findViewById(R.id.app_id);
        viewpage = (ViewPager) findViewById(R.id.soc_id);
        bk = findViewById(R.id.back_id);

        Prof_Adapter prof_adapter = new Prof_Adapter(getSupportFragmentManager());
        prof_adapter.AddFragment(new Profile(),"Profile");
        prof_adapter.AddFragment(new Career(),"Career");

        viewpage.setAdapter(prof_adapter);
        tab.setupWithViewPager(viewpage);

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Navlayout.class);
                startActivity(intent);
            }
        });
    }
}
