package com.example.myapplication11.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication11.R;
import com.example.myapplication11.base.BaseFragment;
import com.example.myapplication11.interfaces.home.IHome;
import com.example.myapplication11.mode.data.HomeBean;
import com.example.myapplication11.presenter.home.HomePresenter;

public class HomeFragment extends BaseFragment<IHome.Presenter> implements IHome.View {


    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {

    }

    @Override
    public IHome.Presenter createPersenter() {
        return new HomePresenter();
    }

    @Override
    public void initData() {

    }
    /**
     *  网络请求 获取
     * @param result
     * @return
     */
    @Override
    public void getHomeReturn(HomeBean result) {

    }
}