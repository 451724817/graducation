package com.app.abby.iweather.contract;

import com.app.abby.iweather.base.BasePresenter;
import com.app.abby.iweather.base.BaseView;
import com.app.abby.iweather.model.api.WeatherBean;

import java.lang.ref.WeakReference;

/**
 * Created by tianhao on 13/4/2018.
 */

public interface HomePageContract {

    interface View extends BaseView<Presenter>{
        void showWeather(WeatherBean weather);
        void toastLoading();
        void toastError();
        void toastComplete();
        WeakReference<android.view.View> provideView();
    }

    interface Presenter extends BasePresenter{
        void loadWeather(String cityId,boolean needToast);
        WeakReference<android.view.View> getView();
    }
}

