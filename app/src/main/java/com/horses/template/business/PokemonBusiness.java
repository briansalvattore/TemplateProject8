package com.horses.template.business;

import com.horses.template.business.callbacks.CallbackPokedex;
import com.horses.template.model.entities.PokemonEntity;
import com.horses.template.model.service.Api;

import java.util.List;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class PokemonBusiness {

    public static void getPokedex(CallbackPokedex callback){

        Api.getService().getPokedex().enqueue(new Callback<List<PokemonEntity>>() {
            @Override
            public void onResponse(Response<List<PokemonEntity>> response, Retrofit retrofit) {

                try {

                    callback.done(response.body());
                }
                catch (Exception e) {

                    callback.failure();
                }
            }

            @Override
            public void onFailure(Throwable t) {

                callback.failure();
            }
        });
    }
}
