package com.login.p;

import android.content.Context;
import android.widget.Toast;

import com.login.m.LoginModel;
import com.login.m.LoginModelImpl;
import com.login.m.OnLoginFinishedListener;

/**
 * Created by Administrator on 2018/7/26.
 */

public class LoginPresenterImp implements LoginPresenter,OnLoginFinishedListener{
    private LoginModel loginModel;
    private Context context;
    public LoginPresenterImp(Context context) {
        this.context=context;
        loginModel=new LoginModelImpl();
    }

    @Override
    public void userInfo(String username, String userpwd) {
            loginModel.login(username,userpwd,this);
    }

    @Override
    public void onSuccess() {
        Toast.makeText(context,"登录成功...",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onErrorInfo() {
        Toast.makeText(context,"密码错误",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNullInfo() {
        Toast.makeText(context,"账号或密码不能为空",Toast.LENGTH_LONG).show();
    }
}
