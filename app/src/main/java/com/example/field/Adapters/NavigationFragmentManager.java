package com.example.field.Adapters;



import androidx.fragment.app.FragmentManager;

import com.example.field.Navlayout;

public class NavigationFragmentManager implements NavigationManager {

    private  static NavigationFragmentManager mlnstance;
    private FragmentManager fragmentManager;
    private Navlayout mainActivity;


    public static NavigationFragmentManager getMlnstance(Navlayout mainActivity){


        if(mlnstance == null)
            mlnstance = new NavigationFragmentManager();
        mlnstance.configure(mainActivity);
        return mlnstance;

    }

    private void configure(Navlayout mainActivity) {

        fragmentManager = mainActivity.getSupportFragmentManager();
    }

    @Override
    public void showFragment(String title) {

    }
}
