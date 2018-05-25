package com.xiaoa.mvpdemo.Main.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 18/5/25.
 */

public class MainModelImpl implements MainModel {


    @Override
    public void getHomeInfo(onQuestFinishListener onQuestFinishListener) {
        onQuestFinishListener.onSuccess(makeList());
    }

    private List<String> makeList() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(i + "小阿");
        }


        return data;
    }
}
