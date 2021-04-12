package com.example.myapplication11.interfaces;


import io.reactivex.disposables.Disposable;

public interface IModel {
    /**
     * 背压式接口
     * @param disposable
     * @return
     */
    void addDisposable(Disposable disposable);

    void clear();
}
