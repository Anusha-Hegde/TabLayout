package com.example.trial;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;


    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs  
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new All();
            case 1:
                return new Going();
            case 2:
                return new Past();
            case 3:
                return new Saved();
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}  