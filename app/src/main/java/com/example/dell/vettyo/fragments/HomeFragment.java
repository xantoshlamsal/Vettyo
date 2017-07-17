package com.example.dell.vettyo.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dell.vettyo.R;
import com.example.dell.vettyo.adapter.AdCardsAdapter;
import com.example.dell.vettyo.model.Ad;
import com.example.dell.vettyo.navigation_drawer;
import com.example.dell.vettyo.rest.ApiClient;
import com.example.dell.vettyo.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerView=null;
    private RecyclerView.LayoutManager layoutManager;
    private AdCardsAdapter adapter = null;
    private List<Ad> ads;
    private ApiInterface apiInterface;
    private static final String TAG = navigation_drawer.class.getSimpleName();
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       View view= inflater.inflate(R.layout.fragment_home, container, false);


        // calculating the number of columns
        int columns = 2;
        DisplayMetrics lDisplayMetrics = getResources().getDisplayMetrics();
        double widthPixels = lDisplayMetrics.widthPixels;
        Log.e("Width", String.valueOf(widthPixels));
        columns = (int) widthPixels / dpToPx(150);

        recyclerView = (RecyclerView) view.findViewById(R.id.ads_recycler_view);
        final RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), columns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        //Lazy Load




//Loading data from API
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Ad>> call = apiInterface.getads();
        call.enqueue(new Callback<List<Ad>>() {
            @Override
            public void onResponse(Call<List<Ad>> call, Response<List<Ad>> response) {
                ads = response.body();
                adapter = new AdCardsAdapter(ads, getContext());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Ad>> call, Throwable t) {

                Log.e(TAG, t.toString());
            }
        });

        // Scroll to top implementation on the click of title icon
//        ImageView titleImage = (ImageView) view.findViewById(R.id.navigation_title_icon);
//        titleImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RecyclerView.State state = new RecyclerView.State();
//                mLayoutManager.smoothScrollToPosition(recyclerView, state, 0);
//            }
//        });

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }



}

