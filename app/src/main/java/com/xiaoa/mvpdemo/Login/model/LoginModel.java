package com.xiaoa.mvpdemo.Login.model;

/**
 * Created by chao on 18/5/24.
 */

/**
 * 用来规定数据接口方法
 * 具体实现交给其实现类
 */
public interface LoginModel {

    void login(String userName,String userPwd,onLoginFinishListener onLoginFinishListener);

     interface onLoginFinishListener {
        void userNameError(String info);

        void userPwdError(String info);

        void onSuccess(String data);

    }





}
