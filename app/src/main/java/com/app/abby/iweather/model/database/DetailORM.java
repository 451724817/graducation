package com.app.abby.iweather.model.database;

/**
 * Created by tianhao on 14/4/2018.
 */
public class DetailORM {

    private int mIconRes;
    private String key;
    private String value;

    public DetailORM(int iconRes,String key,String value){
        this.key=key;
        this.value=value;
        mIconRes=iconRes;
    }

    public String getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

    public int getIconRes(){
        return mIconRes;
    }


}
