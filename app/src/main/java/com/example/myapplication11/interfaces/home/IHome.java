package com.example.myapplication11.interfaces.home;


import com.example.myapplication11.interfaces.Callback;
import com.example.myapplication11.interfaces.IBasePresenter;
import com.example.myapplication11.interfaces.IBaseView;
import com.example.myapplication11.interfaces.IModel;
import com.example.myapplication11.mode.data.HomeBean;

/**
 * home页面的契约类接口
 */
public interface IHome {

    interface View extends IBaseView {
        //定义一个接口给Presenter调用
        void getHomeReturn(HomeBean result);
    }


    interface Presenter extends IBasePresenter<View> {
        //定义一个给View层调用的接口
        void getHome();
    }


    interface Model extends IModel {
        //定义一个给Presenter调用的接口，用来加载数据
        void getHome(Callback<HomeBean> callback);
    }

}
