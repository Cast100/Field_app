package com.example.field;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Favorite extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager view;
    TabLayout layouts;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        toolbar = findViewById(R.id.bar);
        toolbar.setTitle("Favorites");

        view =  findViewById(R.id.id);
        layouts =  findViewById(R.id.Tablayout_id);

        TabpagerAdapter adapters = new TabpagerAdapter(getSupportFragmentManager());
        adapters.AddFragment(new Teams(),"Teams");
        adapters.AddFragment(new Players(),"Players");
        adapters.AddFragment(new leaguesFragment(),"Leagues");

        view.setAdapter(adapters);
        layouts.setupWithViewPager(view);

        BottomNavigationView navigation = findViewById(R.id.nav_id);
        //BottomNav.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){

                    case  R.id.match:
                        startActivity(new Intent(Favorite.this,Navlayout.class));
                        //setFragment(matchesfragment);
                        break;


                    case R.id.news:

                        ///startActivity(new Intent(toolnews.this,toolnews.class));
                        //setFragment(newzfragment);
                        break;

                    case R.id.league:
                        startActivity(new Intent(Favorite.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;
                    case R.id.follow:
                        //startActivity(new Intent(toolnews.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;
                    case R.id.tickets:
                        startActivity(new Intent(Favorite.this,Tickets.class));
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

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}