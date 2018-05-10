package com.app.abby.iweather.contract;

import com.app.abby.iweather.base.BasePresenter;
import com.app.abby.iweather.base.BaseView;
import com.app.abby.iweather.model.database.DrawerItemORM;

import java.util.List;


/**
 * Created by tianhao on 2/4/2018.
 */

public interface DrawerContract {

     interface View extends BaseView<Presenter>{
        void showItem(List<DrawerItemORM> datas);
     }

     interface Presenter extends BasePresenter{
        void loadItem();
    }
}
