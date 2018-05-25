package com.xiaoa.mvpdemo.Login.presenter;

import android.text.TextUtils;

import com.xiaoa.mvpdemo.Login.model.LoginModel;
import com.xiaoa.mvpdemo.Login.view.LoginView;

/**
 * Created by chao on 18/5/24.
 * 具体实现类
 */

public class LoginPresenterImpl implements LoginPresenter, LoginModel.onLoginFinishListener {

    LoginView loginView;
    LoginModel loginModel;


    public LoginPresenterImpl(LoginView loginView, LoginModel loginModel) {
        this.loginView = loginView;
        this.loginModel = loginModel;
    }


    @Override
    public void checkAndDoLogin(String userName, String userPWd) {
        if (loginView != null) {
            loginView.showProgress();
        }

        if (TextUtils.isEmpty(userName)) {
            loginView.userNameError("账号不能为空");
            return;
        }
        if (TextUtils.isEmpty(userPWd)) {
            loginView.userPwdError("密码不能为空");
            return;
        }

        loginModel.login(userName, userPWd, this);

    }

    @Override
    public void userNameError(String info) {
        if (loginView != null) {
            loginView.userNameError(info);
        }
    }

    @Override
    public void userPwdError(String info) {
        if (loginView != null) {
            loginView.userPwdError(info);
        }
    }

    @Override
    public void onSuccess(String data) {
        if (loginView != null) {
            loginView.doLoginSucces(data);
        }
    }
}
