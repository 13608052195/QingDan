package com.example.qingdan;

import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

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
    private int[] mIDs;

    private TabItem[] mTabItem;
    private MainFragemntAdapter mAdapetr;
    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void beforeInitView() {

    }

    @Override
    public void initView() {
        mViewPager=findViewByIdNoCast(R.id.viewPager);
        mIDs=new int[]{R.id.ck_list,R.id.ck_choose,R.id.ck_personal};
        mTabItem=new TabItem[mIDs.length];

        for (int i = 0; i <mIDs.length ; i++) {
            mTabItem[i]= (TabItem) findViewById(mIDs[i]);
            mTabItem[i].setOnClickListener(this);
        }

        mAdapetr=new MainFragemntAdapter(getFragment(),getSupportFragmentManager());
        mViewPager.setAdapter(mAdapetr);

    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }

    private List<Fragment> getFragment (){
        List<Fragment> fargments=new ArrayList<>();
        fargments.add(new FragmentList());
        fargments.add(new FragmentChoose());
        fargments.add(new FragmentMy());
        return fargments;
    }
}
