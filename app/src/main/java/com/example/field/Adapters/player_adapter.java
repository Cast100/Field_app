package com.example.field.Adapters;

import android.content.Context;
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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.transition.Hold;

import java.util.List;

public class player_adapter extends RecyclerView.Adapter<player_adapter.MyHolder> {

    Context mcontext;
    List<info> mdata;
    private  int selectedStarPositon = -1;

    public player_adapter(Context mcontext, List<info> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;

        v = LayoutInflater.from(mcontext).inflate(R.layout.playerz,parent,false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int position) {

        myHolder.tx.setText(mdata.get(position).getName());
         myHolder.img.setImageResource(mdata.get(position).getPhoto());
        myHolder.RD.setChecked(position == selectedStarPositon);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tx;
        ImageView img;
        CardView cardView;
        RadioButton RD;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tx = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.detail);
            cardView = itemView.findViewById(R.id.view_id);
            RD = (RadioButton) itemView.findViewById(R.id.radios_id);
            itemView.setOnClickListener(this);
            RD.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            selectedStarPositon = getAdapterPosition();
            RadioButton rd = v.findViewById(R.id.radios_id);
            RadioGroup Rg = v.findViewById(R.id.radiogroup_id);
            Toast.makeText(mcontext,"Following"+ rd.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
