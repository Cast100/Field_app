package com.example.field.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.field.R;

import java.util.List;
import java.util.Map;

public class Custom_Expandablelist extends BaseExpandableListAdapter {

    private Context mcontext;
    private List<String> listTitle;
    private Map<String,List<String>> listItem;

    public Custom_Expandablelist(Context mcontext, List<String> listTitle, Map<String, List<String>> listItem) {
        this.mcontext = mcontext;
        this.listTitle = listTitle;
        this.listItem = listItem;
    }

    @Override
    public int getGroupCount() {
        return listTitle.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listItem.size();
    }

    @Override
    public Object getGroup(int Position) {
        return listTitle.get(Position) ;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listItem.get(listTitle.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String Title = (String) getGroup(groupPosition);
       if (convertView == null){

           convertView = LayoutInflater.from(mcontext).inflate(R.layout.list_group,null);
       }
        TextView txt = convertView.findViewById(R.id.listTitle);
        txt.setTypeface(null, Typeface.BOLD);
        txt.setText(Title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String Title = (String) getChild(groupPosition,childPosition);
        if (convertView == null){

            convertView = LayoutInflater.from(mcontext).inflate(R.layout.list_item,null);
        }
        TextView txt = convertView.findViewById(R.id.expandablelist);
        ImageView img = convertView.findViewById(R.id.shape);

        txt.setText(Title);
        img.getDrawable();
        return convertView;

    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
