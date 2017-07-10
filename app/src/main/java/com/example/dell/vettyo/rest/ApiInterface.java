package com.example.dell.retroexample.apiHandlers.rest;

import com.example.dell.retroexample.apiHandlers.model.Ad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dell on 6/30/2017.
 */

public interface ApiInterface {
    @GET("/v1/vettyo/ads")
    Call<List<Ad>> getads();


}



