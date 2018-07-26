package com.mvp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"广播已发送",Toast.LENGTH_LONG).show();
        Log.d("tag","广播"+intent.getAction());
    }
}
