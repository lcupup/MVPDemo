package com.xiaoa.mvpdemo.Login.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.xiaoa.mvpdemo.Login.model.LoginModelImpl;
import com.xiaoa.mvpdemo.Login.presenter.LoginPresenterImpl;
import com.xiaoa.mvpdemo.Main.view.MainActivity;
import com.xiaoa.mvpdemo.R;

/**
 * 页面数据的分发与显示
 */
public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText etUserName;
    private EditText etUserPwd;
    private LoginPresenterImpl loginPresenterImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName = findViewById(R.id.et_user_name);
        etUserPwd = findViewById(R.id.et_user_pwd);
        findViewById(R.id.button).setOnClickListener(this);
        loginPresenterImpl = new LoginPresenterImpl(this, new LoginModelImpl());
    }

    @Override
    public void userNameError(String info) {
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void userPwdError(String info) {
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void doLoginSucces(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {

            loginPresenterImpl.checkAndDoLogin(etUserName.getText().toString(), etUserPwd.getText().toString());

        }
    }
}
