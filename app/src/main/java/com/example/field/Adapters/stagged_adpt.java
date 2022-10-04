package com.example.field.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;
import com.example.field.Tickets;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class stagged_adpt extends RecyclerView.Adapter<stagged_adpt.ViewHolder> {

    private Context mcontext;
    private ArrayList<data> mdata;

    public stagged_adpt(Context mcontext, ArrayList<data> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public stagged_adpt.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mcontext).inflate(R.layout.grid_ticket,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull stagged_adpt.ViewHolder holder, int position) {
         data dat = mdata.get(position);
        holder.txt_grd.setText(mdata.get(position).getText_groud());
        holder.txt_mth.setText(mdata.get(position).getText_match());
        holder.imgs.setImageResource(mdata.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_grd;
        private TextView txt_mth;
        private ImageView imgs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

           txt_grd = itemView .findViewById(R.id.groud_id);
           txt_mth = itemView .findViewById(R.id.ticket_match);
           imgs = itemView.findViewById(R.id.grid_id);
        }
    }
}
