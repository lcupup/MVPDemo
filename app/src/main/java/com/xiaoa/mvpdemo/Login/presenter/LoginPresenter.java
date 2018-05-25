package com.xiaoa.mvpdemo.Login.presenter;

/**
 * Created by chao on 18/5/24.
 *
 *衔接 model 与view 做数据处理
 */

public interface LoginPresenter {
    void checkAndDoLogin(String userName, String userPWd);
}
