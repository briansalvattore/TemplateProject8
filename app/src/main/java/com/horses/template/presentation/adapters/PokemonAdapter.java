package com.horses.template.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.horses.template.R;
import com.horses.template.model.entities.PokemonEntity;
import com.horses.template.presentation.holders.PokemonHolder;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {

    private List<PokemonEntity> pokemons;

    public PokemonAdapter(List<PokemonEntity> pokemons){

        this.pokemons = pokemons;
    }

    @Override
    public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);

        return new PokemonHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonHolder holder, int position) {

        PokemonEntity entity = pokemons.get(position);

        holder.setName(entity.getName());
        holder.setType(entity.getPokeType());
        holder.setImage(entity.getSprite());
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }
}
