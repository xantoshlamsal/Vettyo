package com.example.dell.vettyo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell.vettyo.R;

public class SignUpActivity extends AppCompatActivity {
private Button signup_login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup_login_btn=(Button)findViewById(R.id.signup_login_btn);
        signup_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
