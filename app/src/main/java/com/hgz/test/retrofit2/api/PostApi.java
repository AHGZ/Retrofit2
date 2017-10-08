package com.hgz.test.retrofit2.api;

import com.hgz.test.retrofit2.bean.Bean2;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/10/8.
 */

public interface PostApi {
    @FormUrlEncoded
    @POST("region")
    Call<Bean2> postFieldMapData(@FieldMap HashMap<String,String> map);

    @FormUrlEncoded
    @POST("195D0D")
    Call<ResponseBody> downFile(@FieldMap HashMap<String,String> map);
}
