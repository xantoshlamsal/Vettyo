package com.example.dell.vettyo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.dell.vettyo.R;
import com.example.dell.vettyo.model.Ad;


import java.util.List;

/**
 * Created by dell on 6/26/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Ad> ads;
    private Context context;



    public RecyclerAdapter(List<Ad> ads, Context context){
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
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(ads.get(position).getTitle());
        holder.details.setText("Rs. " +ads.get(position).getPrice().toString()+ "/-");
//        Glide.with(context).load(ads.get(position).getPhoto1()).into(holder.thumbnail);
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
