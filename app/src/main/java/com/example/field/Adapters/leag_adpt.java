package com.example.field.Adapters;

import android.content.Context;
import android.os.Build;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

import static java.security.AccessController.getContext;

public class leag_adpt extends RecyclerView.Adapter<leag_adpt.MyHoler> {

    private Context mcontext;
    private List<leagues>listData;
   private int selectedStarPositon = -1;

    public leag_adpt(Context mcontext, List<leagues> listData) {
        this.mcontext = mcontext;
        this.listData = listData;
    }

    @NonNull
    @Override
    public MyHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;

        v = LayoutInflater.from(mcontext).inflate(R.layout.design_team,parent,false);
        MyHoler holer = new MyHoler(v);

        return holer;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHoler holder, int position) {

        holder.tx.setText(listData.get(position).getName());
        holder.img.setImageResource(listData.get(position).getImages());
        holder.RD.setChecked(position == selectedStarPositon);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyHoler extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView tx;
        private ImageView img;
        private CardView card;
        private RadioButton RD;


        public MyHoler(@NonNull View itemView) {
            super(itemView);

            tx =(TextView) itemView.findViewById(R.id.name);
            img = (ImageView) itemView.findViewById(R.id.detail);
            card = itemView.findViewById(R.id.cards_id);
            RD = (RadioButton) itemView.findViewById(R.id.radio);
            itemView.setOnClickListener(this);
            RD.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            selectedStarPositon = getAdapterPosition();
            RadioButton rd = v.findViewById(R.id.radio);
            RadioGroup Rg = v.findViewById(R.id.radiogroup_id);
            Toast.makeText(mcontext,"Following"+ rd.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
