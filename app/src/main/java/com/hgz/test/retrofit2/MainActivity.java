package com.hgz.test.retrofit2;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.hgz.test.retrofit2.api.GetApi;
import com.hgz.test.retrofit2.api.PostApi;
import com.hgz.test.retrofit2.api.RxJavaApi;
import com.hgz.test.retrofit2.bean.Bean;
import com.hgz.test.retrofit2.bean.Bean2;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity==========";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getPathDatas();
//        getDatas();
//        getQueryDatas();
        postFieldMapDatas();
//        downFile();
//        rxjavaPost();
    }

    private void rxjavaPost() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://apis.juhe.cn/oil/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Observable<Bean2> observable = build.create(RxJavaApi.class).getData("北京","4979cecb9f27342f5513cb31dc8e87ad");
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Bean2>() {
            @Override
            public void accept(@NonNull Bean2 bean2) throws Exception {
                Log.e(TAG, "成功"+bean2.getResult().getData().get(0).getName());
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                Log.e(TAG, "失败"+throwable);
            }
        });
    }

    private void downFile() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://surl.qq.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        HashMap<String, String> map = new HashMap<>();
        map.put("qbsrc","51");
        map.put("asr","4286");
        Call<ResponseBody> call = build.create(PostApi.class).downFile(map);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Log.e(TAG, "isSuccessful: ");

                    try {
                        ResponseBody body = response.body();
                        InputStream is = body.byteStream();
                        FileOutputStream fos = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + "/腾讯新闻.apk");
                        byte[] bytes = new byte[2048];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        is.close();
                        fos.flush();
                        fos.close();
                        Log.e(TAG, "下载完成 ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    private void postFieldMapDatas() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://apis.juhe.cn/oil/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HashMap<String, String> map = new HashMap<>();
        map.put("city","北京");
        map.put("key","4979cecb9f27342f5513cb31dc8e87ad");
        Call<Bean2> call = build.create(PostApi.class).postFieldMapData(map);
        call.enqueue(new Callback<Bean2>() {
            @Override
            public void onResponse(Call<Bean2> call, Response<Bean2> response) {
                Bean2 body = response.body();
                Log.e(TAG,body.getResult().getData().get(0).getName());
                Toast.makeText(MainActivity.this,body.getResult().getData().get(0).getName(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Bean2> call, Throwable t) {

            }
        });
    }

    private void getQueryDatas() {
        //http://apis.juhe.cn/oil/region?city=北京&key=4979cecb9f27342f5513cb31dc8e87ad
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://apis.juhe.cn/oil/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HashMap<String, String> map = new HashMap<>();
        map.put("city","北京");
        map.put("key","4979cecb9f27342f5513cb31dc8e87ad");
        Call<Bean2> data = build.create(GetApi.class).getQueryData(map);
        data.enqueue(new Callback<Bean2>() {
            @Override
            public void onResponse(Call<Bean2> call, Response<Bean2> response) {
                if (response.isSuccessful()){
                    Bean2 body = response.body();
                    Log.e(TAG,body.getResult().getData().get(0).getName());
                    Toast.makeText(MainActivity.this,body.getResult().getData().get(0).getName(),Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<Bean2> call, Throwable t) {
                Toast.makeText(MainActivity.this,"失败了",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getDatas() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/history/content/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Call<Bean> data = build.create(GetApi.class).getData();
        data.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Bean body = response.body();
                Log.e(TAG,body.getResults().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

            }
        });
    }

    public void getPathDatas() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/history/content/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Call<Bean> data = build.create(GetApi.class).getPathData(1, 1);
        data.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Bean body = response.body();
                Log.e(TAG,body.getResults().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

            }
        });
    }


}
