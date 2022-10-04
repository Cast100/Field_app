package com.example.field.Adapters;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.NewzFragment;
import com.example.field.R;
import com.example.field.Soccer;

import java.util.List;

public class Adapters extends RecyclerView.Adapter<Adapters.ViewHolder> {

  private LayoutInflater layoutInflater;
  private List<Soccer> data;

  public Adapters(Context context, List<Soccer> data){
    this.layoutInflater = LayoutInflater.from(context);
    this.data = data;
  }



  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

    View view = layoutInflater.inflate(R.layout.cardviewers,viewGroup,false);
    return new ViewHolder(view);

  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    Soccer title = data.get(i);
    viewHolder.tv_soccer.setText((CharSequence) title);
  }

  @Override
  public int getItemCount() {
    return data.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    TextView tv_soccer;
    ImageView img_soccer;
    CardView cardview;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);

      itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

          Intent i = new Intent(v.getContext(),SoccerActivity.class);
          // i.putExtra("title",data.get(getAdapterPosition()));
          v.getContext().startActivity(i);
        }
      });

      tv_soccer = (TextView) itemView.findViewById(R.id.title);
      img_soccer = (ImageView) itemView.findViewById(R.id.nail);
      //cardview = (CardView) itemView.findViewById(R.id.cardview_id);
    }
  }
}
