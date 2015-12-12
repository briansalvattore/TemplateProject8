package com.horses.template.business.callbacks;

import com.horses.template.model.entities.PokemonEntity;

import java.util.List;

public abstract class CallbackPokedex {

    public abstract void done(List<PokemonEntity> pokemons);

    public abstract void failure();
}
