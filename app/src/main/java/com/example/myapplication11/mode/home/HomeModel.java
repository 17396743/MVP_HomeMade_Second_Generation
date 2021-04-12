package com.example.myapplication11.mode.home;

import com.example.myapplication11.base.BaseModel;
import com.example.myapplication11.interfaces.Callback;
import com.example.myapplication11.interfaces.home.IHome;
import com.example.myapplication11.mode.data.HomeBean;
import com.example.myapplication11.net.CommonSubscriber;
import com.example.myapplication11.net.HttpManager;
import com.example.myapplication11.utils.RxUtils;

/**
 * @创建时间 2021/4/12 16:16
 */
public class HomeModel extends BaseModel implements IHome.Model  {
    /**
     *  转移获取到的数据用。
     * @param callback
     * @return
     */
    @Override
    public void getHome(Callback<HomeBean> callback) {
        addDisposable(HttpManager.getInstance().getService().gethome()
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<HomeBean>(callback) {
                    @Override
                    public void onNext(HomeBean homeBean) {
                        callback.success(homeBean);
                    }
                }));
    }
}
