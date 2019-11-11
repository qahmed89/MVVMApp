package com.example.mvvmapp.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL="http://liv-eg.com/api/";

    private static Retrofit getRetroInstance(){
        Gson gson =new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(BASE_URL).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
                addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    public static Api getAPIServices(){
        return getRetroInstance().create(Api.class);
    }
}
