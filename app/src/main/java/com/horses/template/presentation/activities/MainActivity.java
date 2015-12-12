package com.horses.template.presentation.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.horses.template.R;
import com.horses.template.business.PokemonBusiness;
import com.horses.template.business.callbacks.CallbackPokedex;
import com.horses.template.model.entities.PokemonEntity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PokemonBusiness.getPokedex(new CallbackPokedex() {
            @Override
            public void done(List<PokemonEntity> pokemons) {

                Log.i("MainActivity", "pokemons: " + pokemons.size());

                for(PokemonEntity entity : pokemons){

                    Log.i("PokemonEntity", entity.getName());
                }
            }

            @Override
            public void failure() {
                Log.e("MainActivity", "failure");
            }
        });
    }
}
