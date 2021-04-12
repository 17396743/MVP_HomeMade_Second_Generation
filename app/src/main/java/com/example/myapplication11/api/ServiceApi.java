package com.example.myapplication11.api;

import com.example.myapplication11.mode.data.HomeBean;

import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * @创建时间 2021/4/12 11:56
 */
public interface ServiceApi {
    /**
     * 域名
     */
    String BASE_URL = "";

//    Observable 旧版网络请求格式，难以使用背压式。
//    Flowable 新版网络请求格式，支持背压式。

    /**
     * 网站子域名
     * @return
     */
    @GET("")
    Flowable<HomeBean> gethome();

    /**
     * 网站子域名+请求信息
     * @param map
     * @return
     */
    @GET("")
    Flowable<HomeBean> gethome(@QueryMap Map<String, String> map);

    /**
     * 网站子域名+请求信息+请求头信息
     * @param headermap
     * @param map
     * @return
     */
    @GET("")
    Flowable<HomeBean> gethome(@HeaderMap Map<String, String> headermap , @QueryMap Map<String, String> map);

    /**
     * post请求+网站子域名
     * @return
     */
    @FormUrlEncoded
    @POST("")
    Flowable<HomeBean> posthome();

    /**
     * post请求+网站子域名+请求信息
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST("")
    Flowable<HomeBean> posthome(@QueryMap Map<String, String> map);

    /**
     * post请求+网站子域名+请求信息+请求头信息
     * @param headermap
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST("")
    Flowable<HomeBean> posthome(@HeaderMap Map<String,String> headermap,@QueryMap Map<String, String> map);



}
