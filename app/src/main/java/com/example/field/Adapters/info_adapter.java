package com.example.field.Adapters;

import android.content.Context;

import android.service.autofill.Validator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.R;

import java.util.List;

import static java.security.AccessController.getContext;

public class info_adapter extends RecyclerView.Adapter<info_adapter.MyHold> {

    private Context mcontext;
    private List<info> mdata;
    private  int selectedStarPositon = -1;
    //private  AdapterView.OnItemClickListener clickListener;

    public info_adapter(Context mcontext, List<info> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyHold onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v;

           v = LayoutInflater.from(mcontext).inflate(R.layout.team_popular,parent,false);
          MyHold hold = new MyHold(v);

        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHold Hold, int position) {

        Hold.tx.setText(mdata.get(position).getName());
        Hold.img.setImageResource(mdata.get(position).getPhoto());
        Hold.RD.setChecked(position == selectedStarPositon);

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }



    public class MyHold extends RecyclerView.ViewHolder implements View.OnClickListener {

       private TextView tx;
       private ImageView img;
       private RadioButton RD;
        public MyHold(@NonNull View itemView) {
            super(itemView);

            tx =(TextView) itemView.findViewById(R.id.name);
            img = (ImageView) itemView.findViewById(R.id.detail);
            RD = (RadioButton) itemView.findViewById(R.id.radios_id);
            itemView.setOnClickListener(this);
            RD.setOnClickListener(this);
        }

        @Override
        public void onClick(final View v) {

            selectedStarPositon = getAdapterPosition();
            RadioButton rd = v.findViewById(R.id.radios_id);
            RadioGroup Rg = v.findViewById(R.id.radiogroup_id);
             Toast.makeText(mcontext,"Following"+ rd.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
