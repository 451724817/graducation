package com.app.abby.iweather.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by tianhao on 16/4/2018.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView){
        super(itemView);
        ButterKnife.bind(this,itemView);
    }


}
