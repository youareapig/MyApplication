package com.zl;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/7/24.
 */

public class Adapter extends RecyclerView.Adapter{
    private List<String> list;
    private Activity activity;

    public Adapter(List<String> list, Activity activity) {
        Log.d("tag","初始化");
        this.list = list;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder=new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        final ViewHolder viewHolder= (ViewHolder) holder;
        viewHolder.textView.setText(list.get(position));
        viewHolder.textView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus==true){
                    viewHolder.textView.setBackgroundColor(Color.parseColor("#ff0000"));
                    Log.d("tag","选中");
                }else {
                    viewHolder.textView.setBackgroundColor(Color.parseColor("#589000"));
                    Log.d("tag","选中------");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    private class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.item_text);
        }
    }
}
