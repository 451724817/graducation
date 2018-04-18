package com.app.abby.perfectweather.model.database;
/**
 * Created by tianhao on 14/4/2018.
 */
public class ForecastORM {

    private String code;
    private String weekText;
    private String dateText;
    private String weatherText;
    private String tempmaxText;
    private String tempminText;

    public ForecastORM(String week,String date,String weather,String max,String min,String codetxt){
        weekText=week;
        dateText=date;
        weatherText=weather;
        tempmaxText=max;
        tempminText=min;
        code=codetxt;
    }

    public String getWeekText(){
        return weekText;
    }

    public String getDateText(){
        return dateText;
    }

    public String getWeatherText(){
        return weatherText;
    }

    public String getTempmaxText(){
        return tempmaxText;
    }

    public String getTempminText(){
        return tempminText;
    }

    public String getCode(){
        return code;
    }
}
