package com.example.field;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.field.leagues.startimetable;

import java.util.ArrayList;

public class startimetableAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<startimetable> startimetableArrayList;

    public startimetableAdapter(Context context, ArrayList<startimetable> startimetableArrayList){

       this.context = context;
        this.startimetableArrayList = startimetableArrayList;
    }

    public startimetableAdapter(StarTimeleague context, ArrayList<com.example.field.startimetable> startimetableArrayList) {

        this.context = context;

    }


    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public Object getItem(int position) {
        return startimetableArrayList.get(position);
    }

    @Override
    public int getCount() {
        return startimetableArrayList.size();
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder =new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_tablestartime,null,true);
            holder.position = (TextView) convertView.findViewById(R.id.positions);
            holder.image  = (ImageView) convertView.findViewById(R.id.imag);
            holder.team = (TextView) convertView.findViewById(R.id.team_id);
            holder.played =  (TextView) convertView.findViewById(R.id.play);
            holder.win = (TextView) convertView.findViewById(R.id.wins);
            holder.doal = (TextView) convertView.findViewById(R.id.dal);
            holder.loss =(TextView) convertView.findViewById(R.id.los);
            holder.games = (TextView) convertView.findViewById(R.id.game);
            holder.gd = (TextView) convertView.findViewById(R.id.gd);
            holder.points = (TextView) convertView.findViewById(R.id.points);

            convertView.setTag(holder);
        }else{

            holder = (ViewHolder) convertView.getTag();
        }

        holder.position.setText(String.valueOf(startimetableArrayList.get(position).getPosition()));
        holder.image.setImageResource(Integer.parseInt(String.valueOf(startimetableArrayList.get(position).getImage())));
        holder.team.setText(startimetableArrayList.get(position).getTeam());
        holder.played.setText(String.valueOf(startimetableArrayList.get(position).getPlayed()));
        holder.win.setText(String.valueOf(startimetableArrayList.get(position).getWin()));
        holder.played.setText(String.valueOf(startimetableArrayList.get(position).getPlayed()));
        holder.doal.setText(String.valueOf(startimetableArrayList.get(position).getDonal()));
        holder.loss.setText(String.valueOf(startimetableArrayList.get(position).getLoss()));
        holder.games.setText(String.valueOf(startimetableArrayList.get(position).getGame()));
        holder.gd.setText(String.valueOf(startimetableArrayList.get(position).getGd()));
        holder.points.setText(String.valueOf(startimetableArrayList.get(position).getPoints()));

        return convertView;
    }
    private class ViewHolder{

        protected TextView position,team,played,win,doal,loss,games,gd,points;
        protected ImageView image;
    }
}
