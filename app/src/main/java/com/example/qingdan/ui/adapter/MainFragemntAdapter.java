package com.example.qingdan.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Ren_Ji_Wei on 2017/1/6.
 */

public class MainFragemntAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;
    public MainFragemntAdapter(List<Fragment> mFragmentList,FragmentManager fm) {
        super(fm);
        this.mFragmentList=mFragmentList;
    }

    @Override

    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
