package com.example.field;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.widget.GridLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.Recycler;
import com.example.field.Adapters.RecyclerAdapter;
import com.example.field.Adapters.data;
import com.example.field.Adapters.info_adapter;
import com.example.field.Adapters.stagged_adpt;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;

public class Tickets extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    AppBarLayout appBarLayout;
    ViewPager viewers;
    RecyclerView recyclerView;
    GridLayout gridLayout;
    ArrayList<data>mdata;
    stagged_adpt adpt;
    StaggeredGridLayoutManager stagg;


    ///navigation drawer
    DrawerLayout drawer;
    ActionBarDrawerToggle action;
    Toolbar tools;
    NavigationView navigationView;
    private LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);
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
        //BottomNav.disableShiftMode(navigationViewer);
        Menu menu = navigationViewer.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
        navigationViewer.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case  R.id.match:
                        startActivity(new Intent(Tickets.this,Navlayout.class));
                        //setFragment(matchesfragment);
                        break;


                    case R.id.news:

                        startActivity(new Intent(Tickets.this,toolnews.class));
                        //setFragment(newzfragment);
                        break;

                    case R.id.league:
                        startActivity(new Intent(Tickets.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;
                    case R.id.tickets:
                        ///tartActivity(new Intent(Tickets.this,Tickets.class));
                        //setFragment(leaguefragment);
                        break;



                }


                return false;
            }
        });
        recyclerView = findViewById(R.id.leg_ticket) ;
        tickets();
    }


    private  void tickets(){
          ArrayList<data> ad = new ArrayList<>();
        ad.add(new data(R.drawable.kccag,"Kcca Ground","Kcca Vs Police (4pm)"));
        ad.add(new data(R.drawable.named,"Kcca Ground","Kcca Vs Police (4pm)"));
        ad.add(new data(R.drawable.wan,"Wankulukuku Ground","Kcca Vs Police (4pm)"));
        //ad.add(new data(R.drawable.viperg,"Viper Ground","Kcca Vs Police (4pm)"));



        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        stagged_adpt adpt = new stagged_adpt(Tickets.this, ad);
        recyclerView.setAdapter(adpt);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        //stagged_adpt adpt = new stagged_adpt(this,ad);
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //recyclerView.setAdapter(adpt);


    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
