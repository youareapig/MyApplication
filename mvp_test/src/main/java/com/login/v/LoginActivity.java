package com.login.v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.login.m.LoginModelImpl;
import com.login.p.LoginPresenter;
import com.login.p.LoginPresenterImp;
import com.mvp.R;
import com.utils.SharedPreferencesUtil;

public class LoginActivity extends AppCompatActivity {
    private LoginPresenter presenter;
    private EditText username,userpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= (EditText) findViewById(R.id.username);
        userpwd= (EditText) findViewById(R.id.userpwd);
        presenter=new LoginPresenterImp(this);
    }
    public void login(View view){
        String name=username.getText().toString().trim();
        String pwd=userpwd.getText().toString().trim();
        presenter.userInfo(name,pwd);
    }
}
