package com.mvp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DataInterface.View {
    private TextView textView;
    private DataInterface.Presenter presenter;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        handler=new Handler();
        presenter = new DataPrsenter(this);
    }

    public void getData(View view) {
        presenter.loadData();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"测试handler.......",Toast.LENGTH_LONG).show();
            }
        },2000);
    }
    public void send(View view){
        Intent intent=new Intent("com.test");
        sendBroadcast(intent);
    }

    @Override
    public void setData(String s) {
        textView.setText(s);
    }
}
