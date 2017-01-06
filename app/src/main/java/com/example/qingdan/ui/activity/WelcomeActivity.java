package com.example.qingdan.ui.activity;

import android.view.View;

import com.example.qingdan.MainActivity;
import com.example.qingdan.R;
import com.finesdk.activity.BaseActivity;
import com.finesdk.util.common.IntentUtil;

/**
 * 欢迎页面
 */
public class WelcomeActivity extends BaseActivity {


    @Override
    public int getContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void beforeInitView() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               IntentUtil.openActivity(WelcomeActivity.this, MainActivity.class);
                finish();
            }
        }.start();

    }

    @Override
    public void initView() {


    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }

}
