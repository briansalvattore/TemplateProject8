package com.horses.template.model.service;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class Api {

    private static Retrofit restAdapter = new Retrofit.Builder()
            .baseUrl("http://104.236.55.233/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static ApiService getService(){

        return restAdapter.create(ApiService.class);
    }
}
