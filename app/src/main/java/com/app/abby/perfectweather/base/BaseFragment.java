package com.app.abby.perfectweather.base;


import android.support.v4.app.Fragment;


/**
 * Created by tianhao on 2/4/2018.
 */

public abstract class BaseFragment extends Fragment {


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser){
        super.setUserVisibleHint(isVisibleToUser);
        if(getUserVisibleHint()){
            isVisible=true;
            onVisible();
        }else {
            isVisible=false;
            onInVisible();
        }
    }
    protected boolean isVisible;
    protected abstract void lazyload();
    protected void onInVisible(){}
    protected void onVisible(){}


}
