package com.example.field.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.field.League_detalis;
import com.example.field.MyHolder;
import com.example.field.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

    public Recycler(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.league_list,null);


        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

       myHolder.mtxt.setText(models.get(i).getTitle());
       myHolder.img.setImageResource(models.get(i).getImgs());


       myHolder.setItemClicklistener(new ItemClicklistener() {
           @Override
           public void onItemClickListener(View v, int position) {

               String gtxt = models.get(position).getTitle();
               BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.img.getDrawable();

               Bitmap bitmap = bitmapDrawable.getBitmap();
               ByteArrayOutputStream stream = new ByteArrayOutputStream();

               bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
               byte[] bytes = stream.toByteArray();

               Intent i = new Intent(c, League_detalis.class);
               i.putExtra("title",gtxt);
               i.putExtra("images", bytes);
               c.startActivity(i);

           }
       });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
