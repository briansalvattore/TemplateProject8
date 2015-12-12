package com.horses.template.business.callbacks;

import com.horses.template.model.entities.PokemonEntity;

public abstract class CallbackCompare {

    public abstract void done(PokemonEntity pokemon);

    public abstract void failure();
}
