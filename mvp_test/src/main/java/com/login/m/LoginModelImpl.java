package com.login.m;

import android.text.TextUtils;

/**
 * Created by Administrator on 2018/7/26.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(String username, String pwd, OnLoginFinishedListener listener) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(pwd)) {
            listener.onNullInfo();
        } else {
            if (username.equals("zhenglei") && pwd.equals("123")) {
                listener.onSuccess();
            }else {
                listener.onErrorInfo();
            }
        }

    }
}
