package com.mvp;

/**
 * Created by Administrator on 2018/7/25.
 */

public interface DataInterface {
    interface View{
        void setData(String s);
    }

    interface Presenter{
        void loadData();
    }
}
