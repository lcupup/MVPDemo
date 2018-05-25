package com.xiaoa.mvpdemo.Main.presenter;

import com.xiaoa.mvpdemo.Main.model.MainModel;
import com.xiaoa.mvpdemo.Main.model.MainModelImpl;
import com.xiaoa.mvpdemo.Main.view.MainView;

import java.util.List;

/**
 * Created by chao on 18/5/25.
 */

public class MainPresenterImpl implements MainPresenter ,MainModel.onQuestFinishListener {
    MainView mainView;
    MainModelImpl mainModel;

    public MainPresenterImpl(MainView mainView, MainModelImpl mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }


    @Override
    public void onResume() {
        if (mainModel!=null)
            mainModel.getHomeInfo(this);
    }


    @Override
    public void onSuccess(List<String> data) {
        if (mainView!=null)
        mainView.setListData(data);
    }
}
