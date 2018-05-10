package com.app.abby.iweather.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.app.abby.iweather.R;
import com.app.abby.iweather.base.BaseActivity;
import com.app.abby.iweather.contract.SelectCityContract;
import com.app.abby.iweather.presenter.SelectCItyPresenter;
import com.app.abby.iweather.util.Util;
import com.app.abby.iweather.view.fragment.SelectCityFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by tianhao on 15/4/2018.
 */

public class SelectCityActivity extends BaseActivity {

    private SelectCityContract.Presenter presenter;
    private Unbinder unbinder;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    SelectCityFragment fragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        unbinder=ButterKnife.bind(this);

        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("请选择省份或城市");
        setSupportActionBar(toolbar);

        fragment = new SelectCityFragment();
        Util.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.fragment_container);

        presenter = new SelectCItyPresenter(fragment);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        unbinder.unbind();
    }

}
