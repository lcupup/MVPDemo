package com.xiaoa.mvpdemo.Main.model;

import java.util.List;

/**
 * Created by chao on 18/5/25.
 */

public interface MainModel {
    void getHomeInfo(onQuestFinishListener onQuestFinishListener);

    public interface onQuestFinishListener {
        void  onSuccess(List<String> data);
    }

}
