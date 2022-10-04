package com.example.field;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {


    private List<RecycleItem> listviewer;
    private  Context mcontext;

    public Adapter(List<RecycleItem> listviewer, Context mcontext) {
        this.listviewer = listviewer;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_friday,parent,false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final RecycleItem itemList = listviewer.get(position);
        holder.txtoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(mcontext, holder.txtoption);
                popupMenu.inflate(R.menu.option);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                            switch (item.getItemId()){

                                case R.id.table:
                                    Toast.makeText(mcontext,"Show table",Toast.LENGTH_SHORT).show();
                                    break;

                                case R.id.notif:
                                    Toast.makeText(mcontext,"Notification",Toast.LENGTH_SHORT).show();
                                    break;

                                default:
                                    break;
                            }


                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listviewer.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       public  TextView txtoption;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           txtoption = (TextView) itemView.findViewById(R.id.txtoption);
       }
   }
}
