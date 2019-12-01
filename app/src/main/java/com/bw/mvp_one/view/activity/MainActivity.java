package com.bw.mvp_one.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.Toast;

import com.bw.mvp_one.R;
import com.bw.mvp_one.base.BaseActivity;
import com.bw.mvp_one.contract.IHomeContract;
import com.bw.mvp_one.model.bean.Bean;
import com.bw.mvp_one.persenter.HomePersenter;
import com.bw.mvp_one.view.adapter.MyAdaoter;

import java.util.List;

public class MainActivity extends BaseActivity implements IHomeContract.IView {


    private GridView gridView;

    @Override
    protected void initData() {
        HomePersenter homePersenter = new HomePersenter();
        homePersenter.getHomeData(this);

    }

    @Override
    protected void initView() {
        gridView = findViewById(R.id.gv);

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onhomesuccess(Bean bean) {
        Toast.makeText(this, "请求到数据成功"+bean.getCode(), Toast.LENGTH_SHORT).show();
        List<Bean.ListdataBean> listdata = bean.getListdata();
        MyAdaoter myAdaoter = new MyAdaoter(listdata);
        gridView.setAdapter(myAdaoter);


    }

    @Override
    public void onhomeFailure(Throwable throwable) {
        Toast.makeText(this, "请求到数据失败"+throwable.toString(), Toast.LENGTH_SHORT).show();


    }
}
