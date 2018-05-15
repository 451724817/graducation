package com.app.abby.iweather.activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.abby.iweather.R;
import com.app.abby.iweather.base.BaseActivity;
import com.app.abby.iweather.model.database.DrawerItemORM;
import com.app.abby.iweather.model.database.OrmLite;
import com.app.abby.iweather.model.database.UserORM;
import com.litesuits.orm.db.assit.QueryBuilder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/5/15.
 */

public class LoginActivity extends BaseActivity {
    private Unbinder unbinder;
    private  String username;
    private  String password;

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.bt_go)
    Button btGo;
    @BindView(R.id.cv)
    CardView cv;
    @BindView(R.id.fab)
    FloatingActionButton fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        unbinder= ButterKnife.bind(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @OnClick({R.id.bt_go, R.id.fab})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:
                getWindow().setExitTransition(null);
                getWindow().setEnterTransition(null);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(this, fab, fab.getTransitionName());
                    startActivity(new Intent(this, RegisterActivity.class), options.toBundle());
                } else {
                    startActivity(new Intent(this, RegisterActivity.class));
                }
                break;
            case R.id.bt_go:
                username=etUsername.getText().toString();
                password=etPassword.getText().toString();
                List<UserORM> user= OrmLite.getInstance().query(new QueryBuilder<>(UserORM.class).where("username=?",username));
                if (user.size()<=0){
                    Toast.makeText(LoginActivity.this,"账号不存在",Toast.LENGTH_SHORT).show();
                }else {
                    if (username.equals(user.get(0).getUsername()) && password.equals(user.get(0).getPassword())) {
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    } else {
                        Toast.makeText(LoginActivity.this, "密码错误,请重新输入", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }


}
