package com.example.field;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Follow<onDonePressed> extends AppCompatActivity {


    Toolbar toolbar;
    private TabLayout tab;
    private AppBarLayout bar;
    private ViewPager view;
    private LinearLayout mlinearlayout;

    private TextView[] mdots;
    private Viewpage pages;
    SearchView searchView;

    private Button mNextbtn;
    private int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);

        toolbar = (Toolbar) findViewById(R.id.tool_id);
        toolbar.setTitle("Follow Your League");
        tab = (TabLayout) findViewById(R.id.tab_id);
        bar = (AppBarLayout) findViewById(R.id.bar_id);
        view = (ViewPager) findViewById(R.id.data_id);
        mlinearlayout = (LinearLayout)findViewById(R.id.dots);
        //searchView = findViewById(R.id.search_id);

        mNextbtn =(Button)findViewById(R.id.btn_nxt);

        Viewpage page = new Viewpage(getSupportFragmentManager());
        page.AddFragment(new Team(),"");
        //page.AddFragment(new Popular(),"Teams");
        ///page.AddFragment(new Player(), "Players");

        view.setAdapter(page);
        tab.setupWithViewPager(view);

        view.addOnPageChangeListener(viewlistener);

        aDotindicator(0);

        mNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                view.setCurrentItem(mCurrentPage + 1);

               restorePrefData();

               Intent intent = new Intent(Follow.this,Team_Follow.class);
                startActivity(intent);

            }
        });

    }

    private boolean restorePrefData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("finish",MODE_PRIVATE);
        Boolean  isIntoAcivityOpenedBefore = pref.getBoolean("isIntroOpen", false);




        return  isIntoAcivityOpenedBefore;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu,menu);

        SearchManager searchManager = (SearchManager)getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search_eng).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.search_eng:
                Toast.makeText(this,"Search Btn is clicked",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }



    private boolean aDotindicator(int position){

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

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            aDotindicator(i);
            mCurrentPage = i;

            if(i == 1 ){

                mNextbtn.setEnabled(true);
                mNextbtn.setText("Next");
                mNextbtn.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }


    };


}
