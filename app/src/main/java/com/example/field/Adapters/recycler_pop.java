package com.example.field.Adapters;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

import java.util.List;

public class recycler_pop extends RecyclerView.Adapter<recycler_pop.Myhold> {

    private Context mcontext;
    private List<popup_check> checkdata;
    private CheckBoxChecklistener checklistener;


    public recycler_pop(Context mcontext) {
        this.mcontext = mcontext;
        this.checkdata = checkdata;
    }

    @NonNull
    @Override
    public Myhold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_pop,parent,false);

        return new Myhold(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myhold holder, final int position) {

        popup_check Check = checkdata.get(position);
        holder.txt.setText(Check.getName());
        holder.img.setImageResource(Check.getImg_id());
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checklistener != null){
                    checklistener.getCheckBoxlistner(position);
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return checkdata.size();
    }

    public static class Myhold extends RecyclerView.ViewHolder {

        private TextView txt;
        private ImageView img;
        private CheckBox checkBox;
        public Myhold(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.text_id);
            img = itemView.findViewById(R.id.icons_id);
            checkBox = itemView.findViewById(R.id.chck_id);

        }
    }

    public interface CheckBoxChecklistener{

        void getCheckBoxlistner(int position);

    }
    public void setChecklistener(CheckBoxChecklistener checklistener){
        this.checklistener = checklistener;
    }
}
