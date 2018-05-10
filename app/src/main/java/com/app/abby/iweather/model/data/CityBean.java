package com.app.abby.iweather.model.data;

/**
 * Created by tianhao on 14/4/2018.
 */

public class CityBean {

    //group the city relative to  Pinyin
    private String mTag;
    private String mCity;

    public CityBean(String tag,String city){
        mTag=tag;
        mCity=city;
    }

    public String getTag(){
        return mTag;
    }

    public String getCity(){
        return mCity;
    }

    public void setTag(String tag){
        mTag=tag;
    }

    public void setCity(String city){
        mCity=city;
    }
}
