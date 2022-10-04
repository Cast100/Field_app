package com.example.field;



import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewpagerNews extends FragmentPagerAdapter {

    private  final List<Fragment>fragmentlist = new ArrayList<>();
    private  final List<String> fragmenttitle = new ArrayList<>();

    public viewpagerNews(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmenttitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenttitle.get(position);
    }

    public  void Fragment(Fragment fragment, String title){

        fragmentlist.add(fragment);
        fragmenttitle.add(title);

    }

}
