package com.login.m;

/**
 * Created by Administrator on 2018/7/26.
 */

public interface LoginModel {
    void login(String username,String pwd,OnLoginFinishedListener listener);
}
