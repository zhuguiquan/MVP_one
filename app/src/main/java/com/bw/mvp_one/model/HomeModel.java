package com.bw.mvp_one.model;

import com.bw.mvp_one.contract.IHomeContract;
import com.bw.mvp_one.model.bean.Bean;
import com.bw.mvp_one.uitl.NetUitl;
import com.google.gson.Gson;

/**
 * DateTime:2019/12/1 0001
 * author:朱贵全(Administrator)
 * function:
 */
public class HomeModel {
    public void getHomeData(final IHomeContract.IModelCallBack iModelCallBack){
        NetUitl.getInstance().getJson("http://blog.zhaoliang5156.cn/api/news/lawyer.json", new NetUitl.MyCallBack() {
            @Override
            public void onGetJson(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                iModelCallBack.onhomesuccess(bean);


            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallBack.onhomeFailure(throwable);

            }
        });

    }
}
