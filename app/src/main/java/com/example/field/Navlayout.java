package com.example.field;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

import android.view.MenuInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.MenuItem;

import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.field.Adapters.Custom_Expandablelist;
import com.example.field.Adapters.NavigationFragmentManager;
import com.example.field.Adapters.NavigationManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.net.BindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import static com.example.field.R.menu.*;

public  class Navlayout extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    ViewPager viewpager;
    TabLayout tabLayout;
    RecyclerView recycler;
    private RecyclerView recyclerView;
    private Adapter ad;
    private List<RecycleItem> listItems;
    private SwitchCompat drawerswitchL;

    AppBarLayout bar;
    ViewPager viewers;
    TabLayout layouts;
    // cardview
    private CardView starcard,amasazacard;

    // tabs for bottom navigation

    private  League leaguefragment;
    private  Matches matchesfragment;
    private  NewzFragment newzfragment;

    // Menu favourity opt dropdown

   private DrawerLayout mDrawerlayout;
   private ActionBarDrawerToggle DrawerToggle;
   private String mActivityTitle;
   private String[] item;

   private ExpandableListView expandableListView;
   private Custom_Expandablelist Adpt;
   private List<String> lstTitle;
   private Map<String,List<String>> lstChild;
   private  NavigationManager navigationManager;
   private Switch drawer_switch;





    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navlayout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Field");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_id);
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        //expandableListView = findViewById(R.id.expandables);
        navigationManager = NavigationFragmentManager.getMlnstance(this);
        //View listHeaderView = getLayoutInflater().inflate(R.layout.nav_header_navlayout,null,false);
        //expandableListView.addHeaderView(listHeaderView);
        
        //initItems();
        //genData();
        //addDrawersItem();
        setupDrawer();

        if (savedInstanceState == null){

            //selecteFirstItemAsDefault();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setTitle("Field");
        }



        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        /*navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_remove) {

                } else if (id == R.id.nav_setting) {

                    startActivity(new Intent(Navlayout.this, Settings.class));
                } else if (id == R.id.nav_tools) {

                } else if (id == R.id.nav_about) {

                }else if(id == R.id.bet_id){

                }

                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });*/
        //your favourite choice team,player

        tabLayout  = (TabLayout)findViewById(R.id.layout_tab);
        viewpager = (ViewPager)findViewById(R.id.id);
        recycler = findViewById(R.id.recy_id);

        ///new fragment
        //bar = findViewById(R.id.appbar);
        viewers = findViewById(R.id.id);
        layouts = findViewById(R.id.layout_tab);



        TabpagerAdapter adapters = new TabpagerAdapter(getSupportFragmentManager());
        adapters.AddFragment(new MondayFragment(),"Mon 20 APR");
        adapters.AddFragment(new TuesdayFragment(),"Tues 20 APR");
        adapters.AddFragment(new WednesdayFragment(),"Wedn 20 APR");
        adapters.AddFragment(new Yesterday(),"Yesterday");
        adapters.AddFragment(new Today(),"Today");
        adapters.AddFragment(new Tomorrow(),"Tomorrow");
        adapters.AddFragment(new ThursdayFragment(),"Thu 20 APR");
        adapters.AddFragment(new FridayFragment(),"Friday");

        //tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

         ///navigationView.getMenu().findItem(R.id.drawer_id).setActionView(new Switch(this));
         //Switch drawer_switch = (Switch) navigationView.getMenu().findItem(R.id.drawer_id).getActionView();
         //drawer_switch.setChecked(true);

         /*drawer_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked){

                     getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                 }else{

                     getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                 }
             }
         });*/


        viewpager.setAdapter(adapters);
        tabLayout.setupWithViewPager(viewpager);
        viewpager.setCurrentItem(4);
        
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        recyclerView = (RecyclerView)findViewById(R.id.recy_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ad = new Adapter(listItems,this);
        recyclerView.setAdapter(ad);


        //starcard = (CardView) findViewById(R.id.card);
        //amasazacard = (CardView) findViewById(R.id.amascard);
        //starcard.setOnClickListener(this);
        ///amasazacard.setOnClickListener(this);

        //tab match soc

        leaguefragment = new League();
        newzfragment = new NewzFragment();
        matchesfragment = new Matches();


        //Tab
        BottomNavigationView navigationView1 = findViewById(R.id.nav_id);
        //BottomNav.disableShiftMode(navigationView1);
        Menu menu = navigationView1.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        navigationView1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case  R.id.match:
                        // setFragment(matchesfragment);
                        break;

                    case R.id.news:
                        Intent intent1 = new Intent(Navlayout.this,toolnews.class);
                        startActivity(intent1);

                        //startActivity(new Intent(Navlayout.this,toolnews.class));
                        // setFragment(newzfragment);
                        break;

                    case R.id.league:
                        startActivity(new Intent(Navlayout.this,Leagues.class));
                        //setFragment(leaguefragment);
                        break;

                    case R.id.follow:
                        startActivity(new Intent(Navlayout.this,Favorite.class));
                        //setFragment(leaguefragment);
                        break;

                    case R.id.tickets:
                        startActivity(new Intent(Navlayout.this,Tickets.class));
                        //setFragment(leaguefragment);
                        break;



                }

                return false;
            }
        });



    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        DrawerToggle.onConfigurationChanged(newConfig);
    }
    /*private void selecteFirstItemAsDefault() {

      if(navigationManager != null){

          String firstItem = lstTitle.get(0);
          navigationManager.showFragment(firstItem);
          getSupportActionBar().setTitle(firstItem);
      }
    }*/

     private void setupDrawer() {

       DrawerToggle = new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open_drawer,R.string.close_drawer){

           @Override
           public void onDrawerOpened(View drawerView) {
               super.onDrawerOpened(drawerView);
               getSupportActionBar().setTitle("Field");
               invalidateOptionsMenu();
           }

           @Override
           public void onDrawerClosed(View drawerView) {
               super.onDrawerClosed(drawerView);
               getSupportActionBar().setTitle(mActivityTitle);
               invalidateOptionsMenu();
           }
       };

        DrawerToggle.setDrawerIndicatorEnabled(true);
        //mDrawerlayout.setDrawerListener(DrawerToggle);
    }

    /*private void addDrawersItem() {

        Adpt = new Custom_Expandablelist(this,lstTitle,lstChild);
        expandableListView.setAdapter(Adpt);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                getSupportActionBar().setTitle(lstTitle.get(groupPosition));

            }
        });
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                getSupportActionBar().setTitle("Field");
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                String SelectedItem = ((List)(lstChild.get(lstTitle.get(groupPosition))))
                         .get(childPosition).toString();
                getSupportActionBar().setTitle(SelectedItem);

                if(item[0].equals(lstTitle.get(groupPosition)))

                    navigationManager.showFragment(SelectedItem);

                else
                    throw new IllegalArgumentException("Not support fragment");

                mDrawerlayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });
    }*/

    /*private void genData() {
        List<String> title = Arrays.asList("Favourite Team","Favourite Player","Favourite league");
        List<String> childitem = Arrays.asList("Team");

        lstChild = new TreeMap<>();
        lstChild.put(title.get(0),childitem);
        lstChild.put(title.get(1),childitem);
        lstChild.put(title.get(2),childitem);

        lstTitle = new ArrayList<>(lstChild.keySet());
    }*/

    /*private void initItems() {

        item = new String[]{"Favourite Team","Favourite Player","Favourite league"};
    }*/


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(option_menu,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        if (DrawerToggle.onOptionsItemSelected(item))
              return true;

        switch (item.getItemId()){

            case R.id.action_settings:
                Toast.makeText(this,"Setting Btn is clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.app_bar_search:
                Toast.makeText(this,"Search Btn is clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.data:
                 Intent intent = new Intent(Navlayout.this,Calendar.class);
                 startActivity(intent);

                break;

            case R.id.set:
                Toast.makeText(this,"Date  is clicked",Toast.LENGTH_SHORT).show();
                break;

                case R.id.not:
                //Toast.makeText(this," Btn is clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(Navlayout.this);
                String [] ColorsArray = new String[]{"Started","Full Time","Goals","Red Card","Missed Penalty"};
                final boolean [] CheckedColorArray = new boolean[]{
                        true,
                        false,
                        false,
                        false,
                        false
                };
                   final List<String> colorList = Arrays.asList(ColorsArray);
                   builder.setTitle("Set Alerts");
                   builder.setMultiChoiceItems(ColorsArray, CheckedColorArray, new DialogInterface.OnMultiChoiceClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                           CheckedColorArray[which] = isChecked;
                           String currentItem = colorList.get(which);
                           Toast.makeText(Navlayout.this,currentItem+""+ isChecked,Toast.LENGTH_SHORT).show();

                       }
                   });
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                   builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                       }
                   });

                     AlertDialog dialog = builder.create();
                     dialog.show();

                break;

        }
            return super.onOptionsItemSelected(item);
    }




    /*public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_remove) {

        } else if (id == R.id.nav_setting) {

            startActivity(new Intent(Navlayout.this, Settings.class));
        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_about) {

        }else if(id == R.id.bet_id){

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/


    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){

            case R.id.card : i = new Intent(this,friday_cardview.class);startActivity(i);break;
            case R.id.amascard : i  = new Intent(this,amas_cardview.class);startActivity(i);break;
            default:break;
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){

           case R.id.nav_remove:
               startActivity(new Intent(Navlayout.this, Settings.class));
               break;
       }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    /*
    navigationView.setNavigationItemSelectedListener(
            new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem) {
                    menuItem.setChecked(true);
                    mDrawerLayout.closeDrawers();
                    return true;
                }
            });
    */
    }





