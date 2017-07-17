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
import com.example.dell.vettyo.fragments.AdListingByCategoryFragment;
import com.example.dell.vettyo.model.Category;
import com.example.dell.vettyo.navigation_drawer;

import java.util.List;

/**
 * Created by dell on 7/11/2017.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{

    private List<Category> categories;
    private Context context;


    public CategoriesAdapter(List<Category> ads, Context context){
        this.categories=ads;
        this.context=context;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_categories, parent,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.title.setText(categories.get(position).getCname());
        // For Image Loading from API
//        Glide.with(context).load(ads.get(position).getPhoto1()).into(holder.thumbnail);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdListingByCategoryFragment adListingByCategoryFragment = new AdListingByCategoryFragment();
                //passing id as an argument with bundle
                Bundle bundle = new Bundle();
                bundle.putInt("CategoryId", categories.get(position).getCid());
                adListingByCategoryFragment.setArguments(bundle);

                navigation_drawer mainActivity=(navigation_drawer) view.getContext();
                FragmentManager fm = mainActivity.getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.setCustomAnimations(R.animator.enter, R.animator.exit, R.animator.pop_enter, R.animator.pop_exit);
                ft.addToBackStack(null);
                ft.replace(R.id.fragment_space, adListingByCategoryFragment).addToBackStack(null).commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView thumbnail;
        TextView title;
        public MyViewHolder(View itemView) {
            super(itemView);
//            thumbnail=(ImageView)itemView.findViewById(R.id.thumbnail);
            title=(TextView)itemView.findViewById(R.id.category_title);


        }
    }
}