package com.example.field;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.field.Adapters.leag_adpt;
import com.example.field.Adapters.leagues;
import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class leag extends AppCompatActivity {

    Toolbar toolbar;
    private AppBarLayout bar;
    private ViewPager view;
    private LinearLayout mlinearlayout;
    private RecyclerView RV;
    private TextView[] mdots;
    private Viewpage pages;
    private List<leagues> ad;
    private RadioButton radioButton;
    SearchView searchView;

    private Button mNextbtn;
    private int mCurrentPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leag);

        toolbar = (Toolbar) findViewById(R.id.tool_id);
        toolbar.setTitle("Follow Your League");
        bar = (AppBarLayout) findViewById(R.id.bar_id);
        radioButton =(RadioButton) findViewById(R.id.radio);
        view = (ViewPager) findViewById(R.id.data_id);
        mlinearlayout = (LinearLayout)findViewById(R.id.dots);
        //searchView = findViewById(R.id.search_id);


        mNextbtn =(Button)findViewById(R.id.btn_nxt);
        Viewpage page = new Viewpage(getSupportFragmentManager());



        mNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // view.setCurrentItem(mCurrentPage + 1);

                restorePrefData();

                Intent intent = new Intent(getApplicationContext(),Navlayout.class);
                startActivity(intent);

            }
        });


        aDotindicator(0);




    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        RecyclerView RV =(RecyclerView) findViewById(R.id.fav_id);
        leag_adpt adpt = new leag_adpt(this,ad);
        RV.setLayoutManager(new GridLayoutManager(this,3));
        RV.setAdapter(adpt);



        ad = new ArrayList<>();
        ad.add(new leagues(R.drawable.star, "StarTimes\n league"));
        ///cardView = view.findViewById(id.follow_id);
        ad.add(new leagues(R.drawable.up, "Super league"));
        ad.add(new leagues(R.drawable.images, "University\n league"));
        ad.add(new leagues(R.drawable.imagez, "Amasaza"));
        ad.add(new leagues(R.drawable.drum, " Drum\n Tournament"));
        ad.add(new leagues(R.drawable.supers, "Women\n Super"));
        ad.add(new leagues(R.drawable.stanbic, "Stanbic Cup"));
        ad.add(new leagues(R.drawable.fufa, "Women Elite\n league"));
        ad.add(new leagues(R.drawable.stanbic, "Women's \n Cup"));
        ad.add(new leagues(R.drawable.junior, "Juniors\n (U-17)"));
    }

    private boolean restorePrefData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("finish",MODE_PRIVATE);
        Boolean  isIntoAcivityOpenedBefore = pref.getBoolean("isIntroOpen", false);




        return  isIntoAcivityOpenedBefore;
    }

    private boolean aDotindicator(int position) {

        mdots = new TextView[1];
        mlinearlayout.removeAllViews();

        for (int i = 0; i<mdots.length; i++ ){

            mdots[i] = new TextView(this);
            mdots[i].setText(Html.fromHtml("&#8226;"));
            mdots[i].setTextSize(35);
            mdots[i].setTextColor(getResources().getColor(R.color.tab_indicator));

            mlinearlayout.addView(mdots[i]);

        }

        if(mdots.length > 0){

            mdots[position].setTextColor(getResources().getColor(R.color.blue));
        }
        return false;
    }



}