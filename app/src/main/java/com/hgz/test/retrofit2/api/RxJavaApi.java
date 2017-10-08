package com.hgz.test.retrofit2.api;

import com.hgz.test.retrofit2.bean.Bean2;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/10/8.
 */

public interface RxJavaApi {
    @FormUrlEncoded
    @POST("region")
    Observable<Bean2> getData(@Field("city") String city,@Field("key")String key);
}
