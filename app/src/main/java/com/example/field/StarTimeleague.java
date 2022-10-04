package com.example.field;


import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StarTimeleague extends AppCompatActivity {

    private TabLayout tab;
    private AppBarLayout appBar;
    private ViewPager viewpage;



    String [] Team = new String[] {"Kcca","Viper","URA","Tooro United","Mbarara","Onduparaka FC","Bul","Bright Star","Jinja","Express FC","Police","Villa","Maroons","Ndejje University","Nyamityobora","Paidha Black Angels"};
   int[] place =  new int[]  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
     int[] image  = new int[]   {R.drawable.kcca,R.drawable.vipers,R.drawable.ura};
   int[] played = new int[]   {30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30};
     int[] win = new int[]   {19,16,12,13,12,12,11,10,10,10,10,7,8,6,4,2};
     int[] donal = new int[]   {9,11,15,10,10,9,10,11,11,10,7,13,9,9,5,7};
     int[] loss = new int[]   {2,3,3,7,8,9,9,9,9,10,13,10,15,21,21};
     int[] game = new int[]   {38,20,15,9,10,5,5,8,-6,0,-7,2,8,-18,-35,-38};
    int[] gd = new int[]   {61,40,28,32,34,28,33,38,28,30,41,38,32,23,22,17};
     int[] points = new int[]   {66,59,51,49,46,45,46,41,41,40,37,34,33,27,17,13};

   // private ArrayList<startimetable>startimetableArrayList;
    private ListView listView;

    ///Table detail


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startimeleague);

        tab = (TabLayout) findViewById(R.id.Tabslay_id);
        appBar = (AppBarLayout) findViewById(R.id.barlayout);
        viewpage = (ViewPager) findViewById(R.id.viewleag_id);

        Viewpagestartime  pageadapter = new Viewpagestartime(getSupportFragmentManager());
         pageadapter.AddFragment(new TablestartimeFragment(),"TABLE");
         pageadapter.AddFragment(new MatchestartimeFragment(),"MATCHES");
         pageadapter.AddFragment(new PlayerstartimeFragment(),"PLAYER STATS");
         pageadapter.AddFragment(new TablestartimeFragment(),"TRANSFER");

        viewpage.setAdapter(pageadapter);
        tab.setupWithViewPager(viewpage);

       // listView = findViewById(R.id.listviewer);

       // startimetableArrayList = new ArrayList<>();
        List<HashMap<String,String>> alist = new ArrayList<HashMap<String, String>>();

            for (int x = 0; x < 16; x++){

            HashMap<String,String> hm = new HashMap<String,String>();
            hm.put("team",Team[x]);
            hm.put("place",Integer.toString(place[x]));
           // hm.put("image",Integer.toString(image[x]));
            hm.put("played",Integer.toString(played[x]));
            hm.put("win",Integer.toString(win[x]));
            hm.put("donal",Integer.toString(donal[x]));
         //   hm.put("loss",Integer.toString(loss[x]));
            hm.put("game",Integer.toString(game[x]));
            hm.put("gd",Integer.toString(gd[x]));
            hm.put("point",Integer.toString(points[x]));

            alist.add(hm);

            }

            String[] from ={"place","image","team","played","win","donal","loss","game","gd","point"};
            int[] to ={R.id.positions,R.id.imag,R.id.team_id,R.id.play,R.id.wins,R.id.dal,R.id.los,R.id.game,R.id.gd,R.id.points};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(),alist,R.layout.startimestable,from,to);

        ListView simpleview = (ListView)findViewById(R.id.listviewer);
        simpleview.setAdapter(simpleAdapter);
    }

}
