package com.example.myapplication11.interfaces;

public interface Callback<T> {

    void fail(String msg);

    void success(T t);

}
