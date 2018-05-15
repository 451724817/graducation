package com.app.abby.iweather.model.database;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by Administrator on 2018/5/15.
 */

@Table("user_info")
public class UserORM {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private int id;

    private String username;
    private String password;
    public UserORM(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getPassword() {return password;}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
