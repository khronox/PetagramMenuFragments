package com.duquehenry.petagrammenufragments.adapter;

/**
 * Created by hduque on 30/07/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by hduque on 30/07/2016.
 */
public class AdaptadorPage extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;

    //Constructor
    public AdaptadorPage(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
