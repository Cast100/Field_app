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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.Model;
import com.example.field.Adapters.Recycler;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Leagues extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    AppBarLayout appBarLayout;
    ViewPager viewers;

    ///navigation drawer
    DrawerLayout drawer;
    ActionBarDrawerToggle action;
    Toolbar tools;
    NavigationView navigationView;


    ////league
    Recycler recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ///appBarLayout = findViewById(R.id.leg_id);
        //viewers = findViewById(R.id.view_leg);



        tools = findViewById(R.id.bar);
        setSupportActionBar(tools);
        drawer = findViewById(R.id.drawer);
        action = new ActionBarDrawerToggle(this,drawer,tools,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(action);
        action.setDrawerIndicatorEnabled(true);
        action.syncState();

        BottomNavigationView navigationViewer  = findViewById(R.id.nav_id);
        Menu menu = navigationViewer.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigationViewer.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case  R.id.match:
                        startActivity(new Intent(Leagues.this,Navlayout.class));
                        //setFragment(matchesfragment);
                        break;


                    case R.id.news_id:

                        startActivity(new Intent(Leagues.this,toolnews.class));
                        //setFragment(newzfragment);
                        break;

                    case R.id.leagues_id:

                        //setFragment(leaguefragment);
                        break;
                    case R.id.tickets:
                        startActivity(new Intent(Leagues.this,Tickets.class));
                        //
                        //setFragment(leaguefragment);
                        break;

                }


                return false;
            }
        });



        //navigationView = findViewById(R.id.nav_id);
        //navigationView.setNavigationItemSelectedListener(this);


        RecyclerView rview = (RecyclerView) findViewById(R.id.legs);
        recycler = new Recycler(this,getMyList());
        rview.setLayoutManager(new LinearLayoutManager(this));
        ///rview.addItemDecoration(new DividerItemDecoration(getApplicationContext()));
        ///rview.setItemAnimator(new DefaultItemAnimator());
        rview.setAdapter(recycler);



    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("Star Times League");
        m.setImgs(R.drawable.star);
        models.add(m);

        m = new Model();
        m.setTitle("Super League");
        m.setImgs(R.drawable.up);

        models.add(m);

        m = new Model();
        m.setTitle("Amasaza\nTournament");
        m.setImgs(R.drawable.imagez);

        models.add(m);

        m = new Model();
        m.setTitle("University League ");
        m.setImgs(R.drawable.images);

        models.add(m);

        m = new Model();
        m.setTitle(" Region Tournament ");
        m.setImgs(R.drawable.drum);

        models.add(m);

        m = new Model();
        m.setTitle(" Stanbic Tournament");
        m.setImgs(R.drawable.buganda);

        models.add(m);

        m = new Model();
        m.setTitle(" Juniors (U-17)");
        m.setImgs(R.drawable.stanbic);

        models.add(m);

        m = new Model();
        m.setTitle("Women Super League");
        m.setImgs(R.drawable.supers);

        models.add(m);

        m = new Model();
        m.setTitle("Women's Cup ");
        m.setImgs(R.drawable.supers);

        models.add(m);


        return models;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
