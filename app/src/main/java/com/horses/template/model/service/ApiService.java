package com.horses.template.model.service;

import com.horses.template.model.entities.PokemonEntity;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;


public interface ApiService {

    @GET("/api/pokedex")
    Call<List<PokemonEntity>> getPokedex();
}
