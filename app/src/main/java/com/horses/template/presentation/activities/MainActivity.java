package com.horses.template.presentation.activities;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.horses.template.R;
import com.horses.template.business.PokemonBusiness;
import com.horses.template.business.callbacks.CallbackCompare;
import com.horses.template.business.callbacks.CallbackPokedex;
import com.horses.template.model.entities.PokemonEntity;
import com.horses.template.presentation.adapters.PokemonAdapter;

import java.util.List;

import butterknife.Bind;

public class MainActivity extends BaseActivity {

    @Bind(R.id.recycler)
    protected RecyclerView recycler;

    @Bind(R.id.layout)
    protected RelativeLayout layout;

    @Override
    protected int getView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate() {

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(null);

        PokemonBusiness.getPokedex(new CallbackPokedex() {
            @Override
            public void done(List<PokemonEntity> pokemons) {

                layout.setVisibility(View.GONE);
                recycler.setAdapter(new PokemonAdapter(pokemons));
            }

            @Override
            public void failure() {
                Log.e("MainActivity", "failure");
            }
        });

        PokemonBusiness.comparePokes(1, 158, new CallbackCompare() {
            @Override
            public void done(PokemonEntity pokemon) {

                Log.i("PokemonEntity", pokemon.getName());
            }

            @Override
            public void failure() {

                Log.e("MainActivity", "failure");
            }
        });
    }
}
