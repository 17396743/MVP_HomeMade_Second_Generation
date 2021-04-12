package com.example.myapplication11.interfaces;


import io.reactivex.disposables.Disposable;

public interface IModel {

    void addDisposable(Disposable disposable);

    void clear();
}
