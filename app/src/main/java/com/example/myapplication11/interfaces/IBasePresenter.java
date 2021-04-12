package com.example.myapplication11.interfaces;

public interface IBasePresenter<V extends IBaseView> {

    void attachView(V view);

    void unAttachView();


}
