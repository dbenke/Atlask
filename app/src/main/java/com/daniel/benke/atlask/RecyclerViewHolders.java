package com.daniel.benke.atlask;

/**
 * Created by Andrea on 12/02/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView countryName;
    public ImageView countryPhoto;

    private String text2;
    private final Context context;


    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView)itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);

        context = itemView.getContext();

    }

    @Override
    public void onClick(View view) {
       text2 =this.countryName.getText().toString();
        //Toast.makeText(view.getContext(), "Clicked Country Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
        Toast.makeText(view.getContext(), "Clicked Country Position = " + text2, Toast.LENGTH_SHORT).show();



    }
}