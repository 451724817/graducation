package com.app.abby.perfectweather.presenter;

import com.app.abby.perfectweather.contract.DrawerContract;
import com.app.abby.perfectweather.model.database.DrawerItemORM;
import com.app.abby.perfectweather.model.database.OrmLite;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianhao on 15/4/2018.
 */

public class DrawerPresenter implements DrawerContract.Presenter{

    private DrawerContract.View mView;
    private List<DrawerItemORM> mData;
    public DrawerPresenter(DrawerContract.View view){
        mData=new ArrayList<>();
        mView=view;
        mView.setPresenter(this);
    }


    @Override
    public void onsubscribe(String city){

    }

    @Override
    public void onunsubscribe(){

    }

    @Override
    public void loadItem(){

        if(mData!=null){
            mData.clear();
        }

        mData=OrmLite.getInstance().query(DrawerItemORM.class);
        mView.showItem(mData);

    }


}
