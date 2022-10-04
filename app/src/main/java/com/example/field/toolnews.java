package com.example.field;

import android.content.Intent;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class toolnews extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    AppBarLayout bar;
    ViewPager view;
    TabLayout layouts;


    DrawerLayout drawer;
    ActionBarDrawerToggle action;
    Toolbar toolbar;
    NavigationView navigationView;

    private  League leaguefragment;
    private  Matches matchesfragment;
    private  NewzFragment newzfragment;

    List<Soccer> lstSoccer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolnews);
        toolbar = findViewById(R.id.bar);
         toolbar.setTitle("News");

        //bar = findViewById(R.id.appbar);
        view =  findViewById(R.id.id);
        layouts =  findViewById(R.id.Tablayout_id);

        TabpagerAdapter adapters = new TabpagerAdapter(getSupportFragmentManager());
        adapters.AddFragment(new NewzFragment(),"news");
        adapters.AddFragment(new ChampionFragment(),"champions");
        adapters.AddFragment(new TransferFragment(),"transfers");
        adapters.AddFragment(new VideosFragment(),"videos");

        view.setAdapter(adapters);
       layouts.setupWithViewPager(view);

            ///New Fragment


        //setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer);
        action = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(action);
        action.setDrawerIndicatorEnabled(true);
        action.syncState();

        leaguefragment = new League();
        newzfragment = new NewzFragment();
        matchesfragment = new Matches();


        BottomNavigationView navigation = findViewById(R.id.nav_id);
        //BottomNav.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){

                    case  R.id.match:
                        startActivity(new Intent(toolnews.this,Navlayout.class));
                        //setFragment(matchesfragment);
                        break;


                    case R.id.news:

                        ///startActivity(new Intent(toolnews.this,toolnews.class));
                        //setFragment(newzfragment);
                        break;

                    case R.id.league:
                        startActivity(new Intent(toolnews.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;
                    case R.id.follow:
                        //startActivity(new Intent(toolnews.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;
                    case R.id.tickets:
                        startActivity(new Intent(toolnews.this,Tickets.class));
                        //setFragment(leaguefragment);
                        break;



            }
                return false;
        }

            private void setFragment(Fragment fragment) {

                FragmentTransaction Fragments = getSupportFragmentManager().beginTransaction();
                Fragments.replace(R.id.frame_id,fragment);
                Fragments.commit();

            }
            });

        //navigationView = findViewById(R.id.nav_id);
        //navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        return false;
    }


}
