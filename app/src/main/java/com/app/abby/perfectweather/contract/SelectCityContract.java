package com.app.abby.perfectweather.contract;

import com.app.abby.perfectweather.base.BasePresenter;
import com.app.abby.perfectweather.base.BaseView;
import com.app.abby.perfectweather.model.data.City;
import com.app.abby.perfectweather.model.data.CityBean;
import com.app.abby.perfectweather.model.data.Province;

import java.util.List;

/**
 * Created by tianhao on 2/4/2018.
 */

public interface SelectCityContract {

    interface View extends BaseView<Presenter>{
        void updateCities(List<City> cities, List<CityBean> cityBean);
        void updateProvinces(List<Province> provinces,List<CityBean> cityBean);
    }
    interface Presenter extends BasePresenter{
        void loadCities(int portNum);
        void loadProvinces();
    }
}
