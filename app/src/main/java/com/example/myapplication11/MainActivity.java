package com.example.myapplication11;

import com.example.myapplication11.interfaces.main.IMain;
import com.example.myapplication11.base.BaseActivity;




/**
 * 主界面
 */
public class MainActivity extends BaseActivity<IMain.Presenter> implements IMain.View {


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initFragments();

    }


    private void initFragments(){

    }

    @Override
    protected IMain.Presenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }
}