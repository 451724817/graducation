package com.app.abby.iweather.model.database;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by tianhao on 14/4/2018.
 */

@Table("drawer_item")
public class DrawerItemORM {

    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private int id;

    private String mCity;
    private String mTemp;
    private String mCode;

    public DrawerItemORM(String city,String temp,String code){
        mCity=city;
        mTemp=temp;
        mCode=code;
    }

    public String getCity(){
        return mCity;
    }
    public String getTemp(){return mTemp;}
    public String getCode(){
        return mCode;
    }

    public void setCity(String city){
        mCity=city;
    }

    public void setTemp(String temp){
        mTemp=temp;
    }

    public void setCode(String code){
        mCode=code;
    }

}
