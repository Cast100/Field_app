package com.example.field;


import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.Adapters.info;
import com.example.field.Adapters.info_adapter;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
import static com.example.field.R.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class Popular extends Fragment implements AdapterView.OnItemClickListener  {

    View fg;
    private RecyclerView RV;
    private List<info> ad;
    private RadioGroup radiogroup;
    private RadioButton radioButton;
    private ButtonBarLayout mNextbtn;
    LinearLayout layout;
    String buttonSelected;

    public Popular() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fg = inflater.inflate(R.layout.fragment_popular, container, false);

          RV = fg.findViewById(id.popular_team);
          layout = fg.findViewById(id.layout_id);
          radiogroup =(RadioGroup) fg.findViewById(id.radiogroup_id);
          radioButton = (RadioButton) fg.findViewById(id.radios_id);
           mNextbtn =fg.findViewById(R.id.btn_nxt);



           /*radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup group, int checkedId) {
                 int radioId = radiogroup.getCheckedRadioButtonId();
                   radioButton  = fg.findViewById(radioId);
                   Toast.makeText(getContext(),"" + radioButton.getText(),Toast.LENGTH_SHORT).show();
                  // RadioButton radioButton = fg.findViewById(checkedId);
                  /// radioButton.isChecked();
                   //Toast.makeText(getActivity(),radioButton.getText(),Toast.LENGTH_SHORT).show();

               }
           });*/

           //radioButton.isChecked();

          info_adapter adpt = new info_adapter(getContext(),ad);
          RV.setLayoutManager(new GridLayoutManager(getContext(),3));
          RV.setAdapter(adpt);

        return fg;
    }





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       
            ad = new ArrayList<>();
            ad.add(new info("Kcca F.C","", drawable.kcca));
            ad.add(new info("SC Villa","", drawable.villa));
            //ad.add(new info("viper","",R.drawable.vi));
            ad.add(new info("Proline Club","", drawable.pfc));
            ad.add(new info("Police Club","", drawable.poli));
            ad.add(new info("Onduparaka \n F.C","", drawable.onduparaka));
            ad.add(new info("Bright Star","", drawable.bright));
            ad.add(new info("Nyamityobo \n ra","", drawable.nyamityobora_logo));
            ad.add(new info("Paidha Blank","", drawable.paidha_logo));
            ad.add(new info("Ndejja \n University","", drawable.ndejje));
            //ad.add(new info("bul","",R.drawable.bul));
            //ad.add(new info("tooro","",R.drawable.tooro));
            ///ad.add(new info("express","",R.drawable.express));
           ad.add(new info("Simba Club","", drawable.simba));


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     //RadioButton radioButton = view.findViewById(checkedId);
     ///Toast.makeText(getContext(),String.valueOf(position) +". "+radioButton.getText(),Toast.LENGTH_SHORT).show();

    }
}
