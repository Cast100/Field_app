package com.example.field.slider;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapterslider extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> mFragment = new ArrayList<>();

    public MyAdapterslider(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);

        mFragment = fragments;
    }

    @Override

    public Fragment getItem(int i) {
        return mFragment.get(i);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}
