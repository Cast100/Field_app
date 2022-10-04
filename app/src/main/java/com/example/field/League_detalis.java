package com.example.field;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.Adapter_details;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class League_detalis extends AppCompatActivity {

    Toolbar toolbar;
    private TabLayout tab;
    private AppBarLayout bar;
    private ViewPager view;
    TextView mtxt;
    ImageView mImg,bk_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_detalis);
         toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tab = (TabLayout) findViewById(R.id.layout_tab);
        bar = (AppBarLayout) findViewById(R.id.applayout);
        view = (ViewPager) findViewById(R.id.Pager_id);

        Adapter_details details = new Adapter_details(getSupportFragmentManager());
        details.AddFragment(new Tablematch(),"Table");
        details.AddFragment(new Fixture(),"Fixture");
        details.AddFragment(new New_match(),"News");
        details.AddFragment(new Top_scorers(),"Top  Scorers");

        view.setAdapter(details);
        tab.setupWithViewPager(view);

        mtxt = findViewById(R.id.txt_league);
        mImg = findViewById(R.id.imgs);
        bk_img = findViewById(R.id.backspace_id);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("title");
        byte[] mByte = intent.getByteArrayExtra("images");
        //Bitmap bitmap = BitmapFactory.decodeByteArray(mByte,0,mByte.length);

        //mtxt.setText(mTitle);
        //mImg.setImageBitmap(bitmap);
       bk_img.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),Navlayout.class);
               startActivity(intent);
           }
       });

    }

}
