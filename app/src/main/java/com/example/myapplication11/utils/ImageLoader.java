package com.example.myapplication11.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication11.MyApp;

public class ImageLoader {

    /**
     * 封装图片加载的方法 有图/无图
     * @param url
     * @param img
     */
    public static void imageLoad(String url, ImageView img){
        boolean bool = SpUtils.getInstance().getBoolean("imageloader");
        if(bool){
            Glide.with(MyApp.app).load(url).into(img);
        }
    }

}
