package com.example.qingdan;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.example.qingdan.ui.adapter.MainFragemntAdapter;
import com.example.qingdan.ui.fragment.FragmentChoose;
import com.example.qingdan.ui.fragment.FragmentList;
import com.example.qingdan.ui.fragment.FragmentMy;
import com.finesdk.activity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ren_Ji_Wei on 2017/1/6.
 * 首页
 */
public class MainActivity extends BaseActivity {
    private ViewPager mViewPager;
    private MainFragemntAdapter mAdapetr;
    private TabLayout mTabLayout;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;

    }

    @Override
    public void beforeInitView() {


    }

    @Override
    public void initView() {
        mViewPager = findViewByIdNoCast(R.id.viewPager);
        mTabLayout = findViewByIdNoCast(R.id.MainTabLayout);
        mAdapetr = new MainFragemntAdapter(getFragment(), getSupportFragmentManager());
        mViewPager.setAdapter(mAdapetr);
        mTabLayout.setupWithViewPager(mViewPager);//tabLayout和ViewPager联动
        mTabLayout.getTabAt(0).setIcon(R.drawable.tabbar_btn_list);
        mTabLayout.getTabAt(1).setIcon(R.drawable.tabbar_btn_choose);
        mTabLayout.getTabAt(2).setIcon(R.drawable.tabbar_btn_personage);
        mTabLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                mTabLayout.isSelected();//设置选中的图片改变

            }
        });
    }

    @Override
    public void initData() {


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    private List<Fragment> getFragment() {
        List<Fragment> fargments = new ArrayList<>();
        fargments.add(new FragmentList());
        fargments.add(new FragmentChoose());
        fargments.add(new FragmentMy());
        return fargments;
    }

}
