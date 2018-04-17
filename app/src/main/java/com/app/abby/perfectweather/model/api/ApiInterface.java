package com.app.abby.perfectweather.model.api;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiInterface {

    String HOST="https://free-api.heweather.com/v5/";
    //String HOST="https://free-api.heweather.com/s6/";

    @GET("weather")
    Observable<WeatherBean> mWeatherAPI(@Query("city") String city, @Query("key") String key);

}
