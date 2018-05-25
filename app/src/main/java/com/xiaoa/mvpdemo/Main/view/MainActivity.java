package com.xiaoa.mvpdemo.Main.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.xiaoa.mvpdemo.Main.model.MainModelImpl;
import com.xiaoa.mvpdemo.Main.presenter.MainPresenterImpl;
import com.xiaoa.mvpdemo.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recycler;
    private MainPresenterImpl mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recyclerview);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        mainPresenter = new MainPresenterImpl(this,new MainModelImpl());

    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    public void setListData(List<String> data) {
        recycler.setAdapter( new MyAdapter(this,data));
    }
}
