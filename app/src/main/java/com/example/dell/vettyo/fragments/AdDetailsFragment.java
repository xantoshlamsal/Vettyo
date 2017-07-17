package com.example.dell.vettyo.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.vettyo.R;
import com.example.dell.vettyo.model.Ad;
import com.example.dell.vettyo.rest.ApiClient;
import com.example.dell.vettyo.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdDetailsFragment extends Fragment {
    private ApiInterface apiInterface;
    private Ad product=null;
    private TextView title=null,price, negotiable, views, city, used_for, description, detail, seller_name, location, condition;
    private RelativeLayout relativeLayout=null;

    public AdDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ad_details, container, false);
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        apiInterface= ApiClient.getClient().create(ApiInterface.class);
        int id=getArguments().getInt("Adid");
        Call<Ad> call = apiInterface.getAdDetails(id);

        call.enqueue(new Callback<Ad>() {
            @Override
            public void onResponse(Call<Ad> call, Response<Ad> response) {
                product=response.body();
                title=(TextView)getView().findViewById(R.id.tv_product_name);
                title.setText(product.getTitle());

                price=(TextView)getView().findViewById(R.id.tv_product_price);
                price.setText("Rs. "+ product.getPrice()+ "/-");

                negotiable=(TextView)getView().findViewById(R.id.price_negotiable_flag);
                if(product.getPriceNeg()==true)
                 negotiable.setText("Yes");
                else
                    negotiable.setText("No");

                views=(TextView)getView().findViewById(R.id.ad_views);
                views.setText(product.getViews().toString()+"views");

                seller_name=(TextView)getView().findViewById(R.id.seller_name);
                seller_name.setText("Seller: "+ product.getUserName());

                location=(TextView)getView().findViewById(R.id.location);
                location.setText("Location: "+ product.getAddress());





            }

            @Override
            public void onFailure(Call<Ad> call, Throwable t) {

                Log.e(TAG, t.toString());
            }
        });
    }
}
