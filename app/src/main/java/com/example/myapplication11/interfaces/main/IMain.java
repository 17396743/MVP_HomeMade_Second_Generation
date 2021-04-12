package com.example.myapplication11.interfaces.main;


import com.example.myapplication11.interfaces.IBasePresenter;
import com.example.myapplication11.interfaces.IBaseView;
import com.example.myapplication11.interfaces.IModel;
/**
 * MainActivity页面的契约类接口
 */
public interface IMain {

    interface View extends IBaseView {
        //定义一个接口给Presenter调用

    }


    interface Presenter extends IBasePresenter<View> {
        //定义一个给View层调用的接口
    }


    interface Model extends IModel {
        //定义一个给Presenter调用的接口，用来加载数据

    }
}
