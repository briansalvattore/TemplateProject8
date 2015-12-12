package com.horses.template.presentation.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.horses.template.R;
import com.horses.template.utils.DisplayListener;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PokemonHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.image)
    protected ImageView image;

    @Bind(R.id.name)
    protected TextView name;

    @Bind(R.id.type)
    protected TextView type;

    public PokemonHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setImage(String url) {

        ImageLoadingListener displayListener = new DisplayListener();

        ImageLoader.getInstance()
                .displayImage(url, image, DisplayListener.optionsImageUnLoad, displayListener);
    }

    public void setName(String  name) {

        this.name.setText(name);
    }

    public void setType(String type) {

        this.type.setText(type);
    }
}
