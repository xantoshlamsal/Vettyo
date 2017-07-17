package com.example.dell.vettyo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.vettyo.R;
import com.example.dell.vettyo.navigation_drawer;

public class UserProfileActivity extends navigation_drawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }
}
