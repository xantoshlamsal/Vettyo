package com.example.dell.vettyo.rest;



import com.example.dell.vettyo.model.Ad;
import com.example.dell.vettyo.model.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by dell on 6/30/2017.
 */

public interface ApiInterface {
    @GET("/v1/vettyo/ads")
    Call<List<Ad>> getads();

    @GET("/v1/vettyo/ads/{id}")
    Call<Ad> getAdDetails(@Path("id") int id);

    @GET("/v1/vettyo/categories")
    Call<List<Category>> getCategories();

    @GET("/v1/vettyo/ads/categories/{id}")
    Call <List<Ad>> getAdsByCategory(@Path("id") int id);

    @GET("/v1/vettyo/ads?featured=true")
    Call<List<Ad>> getFeaturedAds();

}



