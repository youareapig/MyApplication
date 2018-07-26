package com.mvp;

/**
 * Created by Administrator on 2018/7/25.
 */

public class DataPrsenter implements DataInterface.Presenter{
private DataInterface.View view;

    public DataPrsenter(DataInterface.View view) {
        this.view = view;
    }

    @Override
    public void loadData() {
        view.setData("mvp改变的数据------");
    }
}
