package com.xiaoa.mvpdemo.Login.view;

/**
 * Created by chao on 18/5/24.
 */

public interface LoginView {
    void userNameError(String info);

    void userPwdError(String info);

    void doLoginSucces(String data);

    void showProgress();

}
