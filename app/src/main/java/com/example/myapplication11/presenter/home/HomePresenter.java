package com.example.myapplication11.presenter.home;

import android.widget.Toast;

import com.example.myapplication11.base.BasePresenter;
import com.example.myapplication11.interfaces.Callback;
import com.example.myapplication11.interfaces.home.IHome;
import com.example.myapplication11.mode.data.HomeBean;
import com.example.myapplication11.mode.home.HomeModel;

/**
 * @创建时间 2021/4/12 16:14
 */
public class HomePresenter extends BasePresenter<IHome.View> implements IHome.Presenter {
    /**
     *  调用接口 model 连接 实体类 model
     * @param model
     * @return
     */
    IHome.Model model;

    public HomePresenter() {
        model = new HomeModel();
    }

    @Override
    public void getHome() {
        model.getHome(new Callback<HomeBean>() {
            /**
             *  报错信息
             * @param msg
             * @return
             */
            @Override
            public void fail(String msg) {
                mView.showToast(msg, Toast.LENGTH_SHORT);
            }
            /**
             *  网络请求获取到的，通过接口进行转移。
             * @param homeBean
             * @return
             */
            @Override
            public void success(HomeBean homeBean) {
                mView.getHomeReturn(homeBean);
            }
        });
    }
}
