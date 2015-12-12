package com.horses.template.model.service;

import com.horses.template.model.entities.PokemonEntity;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;


public interface ApiService {

    @GET("/api/pokedex")
    Call<List<PokemonEntity>> getPokedex();

    @Multipart
    @POST("/api/pokedex/compare")
    Call<PokemonEntity> comparePokes(@Part("id_poke1") int id1, @Part("id_poke2") int id2);
}
