package com.bw.mvp_one.persenter;

import com.bw.mvp_one.contract.IHomeContract;
import com.bw.mvp_one.model.HomeModel;
import com.bw.mvp_one.model.bean.Bean;

/**
 * DateTime:2019/12/1 0001
 * author:朱贵全(Administrator)
 * function:
 */
public class HomePersenter {
    public void getHomeData(final IHomeContract.IView iView){
        HomeModel homeModel = new HomeModel();
        homeModel.getHomeData(new IHomeContract.IModelCallBack() {
            @Override
            public void onhomesuccess(Bean bean) {
                iView.onhomesuccess(bean);

            }

            @Override
            public void onhomeFailure(Throwable throwable) {
                iView.onhomeFailure(throwable);

            }
        });

    }
}
