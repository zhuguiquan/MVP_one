package com.bw.mvp_one.contract;

import com.bw.mvp_one.model.bean.Bean;

/**
 * DateTime:2019/12/1 0001
 * author:朱贵全(Administrator)
 * function:
 */
public interface IHomeContract {
    //m层通知p
    interface IModelCallBack{
        void onhomesuccess(Bean bean);
        void onhomeFailure(Throwable throwable);
    }
    //p层通知v
    interface IView{
        void onhomesuccess(Bean bean);
        void onhomeFailure(Throwable throwable);
    }

}
