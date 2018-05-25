package com.xiaoa.mvpdemo.Login.model;

import android.text.TextUtils;

/**
 * Created by chao on 18/5/24.
 * 数据请求，用来做实际数据请求
 * 以便交给 presenter实现类进行数据封装
 */

public class LoginModelImpl implements LoginModel {

    @Override
    public void login(final String userName, final String userPwd, final onLoginFinishListener onLoginFinishListener) {
         //本地校验

        //模拟网络请求
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(userName)) {
                    onLoginFinishListener.userNameError("账号错误");
                    return;
                }
                if (TextUtils.isEmpty(userPwd)) {
                    onLoginFinishListener.userPwdError("密码错误");
                    return;
                }
                onLoginFinishListener.onSuccess(makeString());
            }
        }, 2000);


    }

    /**
     * 模拟接口请求成功回调
     * @return
     */
    public String makeString() {
        return "登录成功";
    }

}
