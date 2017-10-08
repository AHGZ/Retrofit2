package com.hgz.test.retrofit2.api;

import com.hgz.test.retrofit2.bean.Bean;
import com.hgz.test.retrofit2.bean.Bean2;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2017/10/8.
 */

public interface GetApi {
    //这种请求方式使用了 @Path 这个{pid}就相当于一个可变参数。具体的参数就是下面传递过来的id
    //最终请求的网址就是：http://172.168.22.32/mall/category/product/{pid} 这里的pid就是传递过来的pid的值
    @GET("{number}/{page}")
    Call<Bean> getPathData(@Path("number") int n, @Path("page") int p);

    @GET("1/1")
    Call<Bean> getData();

    @GET("region")
    Call<Bean2> getQueryData(@QueryMap HashMap<String, String> map);

}
