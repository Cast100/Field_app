package com.example.field;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.field.Adapters.info;
import com.example.field.Adapters.info_adapter;
import com.example.field.Adapters.leag_adpt;
import com.example.field.Adapters.leagues;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.field.R.*;
import static com.example.field.R.id.card;
import static com.example.field.R.string.following;


/**
 * A simple {@link Fragment} subclass.
 */
public class Team extends Fragment {

    View  view;
    private RecyclerView RV;
    private List<leagues> ad;
    private GridLayout mGrid;
    private LinearLayout linearLayout;
    private int mCurrentPage;
    private RadioButton radioButton;
    ImageView imageView;
    private ViewPager viewPager;

    public Team() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(layout.fragment_team, container, false);
        imageView = view.findViewById(R.id.detail);
        radioButton =(RadioButton) view.findViewById(id.radio);

        //mGrid = view.findViewById(id.grid_id);
        //linearLayout = view.findViewById(id.following__id);


        RV = view.findViewById(id.fav_id);
        leag_adpt adpt = new leag_adpt(getContext(),ad);
        RV.setLayoutManager(new GridLayoutManager(getContext(),3));
        RV.setAdapter(adpt);
         //setSingleEvent(RV);
         //setToggleEvent(mGrid);


        return view;
    }



    private void setToggleEvent(GridLayout mGrid) {
        /*for (int i =0; i<mGrid.getChildCount(); i++ ){

            final CardView cardview = (CardView)mGrid.getChildAt(i);
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                  if (cardview.callOnClick()){
                      linearLayout.setEnabled(true);
                      linearLayout.setVisibility(View.VISIBLE);
                  }
                }
            });

        }*/

    }

    private void setSingleEvent(RecyclerView rv) {

        /*for (int i =0;i<RV.getChildCount(); i++ ){

            CardView cardview = (CardView)lay.getChildAt(i);
            final int finalI = i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(getContext(),"Click at index"+finalI,Toast.LENGTH_SHORT).show();
                }
            });

        }*/
    }


    ViewPager.OnPageChangeListener viewlist = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            mCurrentPage = position;

            if(position == 0){

                //txt.setEnabled(true);
                //txt.setText("Following");
                //txt.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ad = new ArrayList<>();
        ad.add(new leagues(drawable.star, "StarTimes\n league"));
        ///cardView = view.findViewById(id.follow_id);
        ad.add(new leagues(drawable.up, "Super league"));
        ad.add(new leagues(drawable.images, "University\n league"));
        ad.add(new leagues(drawable.imagez, "Amasaza\n Tournament"));
        ad.add(new leagues(drawable.drum, " Drum\n Tournament"));
        ad.add(new leagues(drawable.supers, "Women Super\n league"));
        ad.add(new leagues(drawable.stanbic, "Stanbic Cup"));
        ad.add(new leagues(drawable.fufa, "Women Elite\n league"));
        ad.add(new leagues(drawable.stanbic, "Women's Cup"));
        ad.add(new leagues(drawable.junior, "Juniors(U-17)"));





    }
}
