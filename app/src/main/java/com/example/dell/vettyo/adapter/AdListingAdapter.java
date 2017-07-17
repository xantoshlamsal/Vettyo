package com.example.dell.vettyo.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dell.vettyo.R;
import com.example.dell.vettyo.fragments.AdDetailsFragment;
import com.example.dell.vettyo.model.Ad;
import com.example.dell.vettyo.navigation_drawer;


import java.util.List;

/**
 * Created by dell on 6/26/2017.
 */

public class AdCardsAdapter extends RecyclerView.Adapter<AdCardsAdapter.MyViewHolder>{

    private List<Ad> ads;
    private Context context;


    public AdCardsAdapter(List<Ad> ads, Context context){
        this.ads=ads;
        this.context=context;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_ads, parent,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.name.setText(ads.get(position).getTitle());
        holder.details.setText("Rs. " +ads.get(position).getPrice().toString()+ "/-");

        // For Image Loading from API
//        Glide.with(context).load(ads.get(position).getPhoto1()).into(holder.thumbnail);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AdDetailsFragment adDetailsFragment = new AdDetailsFragment();

                //passing id as an argument with bundle
                Bundle bundle = new Bundle();
                bundle.putInt("Adid", ads.get(position).getAdid());
                adDetailsFragment.setArguments(bundle);

                navigation_drawer mainActivity=(navigation_drawer) view.getContext();
                FragmentManager fm = mainActivity.getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.setCustomAnimations(R.animator.enter, R.animator.exit, R.animator.pop_enter, R.animator.pop_exit);
                ft.addToBackStack(null);
                ft.replace(R.id.fragment_space, adDetailsFragment).addToBackStack(null).commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return ads.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView thumbnail;
        TextView name, details;
        public MyViewHolder(View itemView) {
            super(itemView);
//            thumbnail=(ImageView)itemView.findViewById(R.id.thumbnail);
            name=(TextView)itemView.findViewById(R.id.title);
            details=(TextView)itemView.findViewById(R.id.price);

        }
    }
}
