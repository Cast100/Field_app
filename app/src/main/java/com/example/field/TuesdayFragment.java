package com.example.field;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.field.Adapters.AdapterTeam2;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.Adapter_Team;
import com.example.field.Adapters.recycler_pop;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TuesdayFragment extends Fragment {

    View views;

    private RecyclerView recyclerView;
    Adapter_Team adapterTeam;
    //AdapterTeam2 adp;
    private TextView txt_op,txt_league;
    private ImageView img_bk;
    private PopupMenu popupMenu;
    private LinearLayout layout;
    private RecyclerView recy_View;
    private Dialog mydialog;


    public TuesdayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       views = inflater.inflate(R.layout.fragment_tuesday, container, false);
       txt_league = views.findViewById(R.id.star_league);
       txt_op = views.findViewById(R.id.txt_option);
       layout = views.findViewById(R.id.match_id);


       //ShowPop();
        txt_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(getContext(),txt_op);
                popupMenu.inflate(R.menu.option);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    private Object View;
                    /// AlertDialog

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){

                            case R.id.table:
                                Intent intent = new Intent(getContext(),League_detalis.class);
                                startActivity(intent);

                                //Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.notif:
                                //Toast.makeText(mcontext,"show",Toast.LENGTH_SHORT).show();
                                mydialog = new Dialog(getContext());
                                showpop();

                        }

                        return false;
                    }

                    private void showpop() {

                        mydialog.setContentView(R.layout.popup);
                        mydialog.show();
                    }

                });
                popupMenu.show();
            }
        });

        /*txt_league.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });*/
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Star1_Monday.class);
                startActivity(intent);
            }
        });


       return views;
    }

}
