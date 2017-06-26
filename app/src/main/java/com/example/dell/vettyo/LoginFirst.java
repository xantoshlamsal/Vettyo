package com.example.dell.vettyo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell.vettyo.activity.MainActivity;
import com.example.dell.vettyo.activity.SignUpActivity;

public class LoginFirst extends AppCompatActivity {

    private Button guest_btn;
    private Button signup_with_email_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_first);
        loginbuttonclick();
    }

    public void loginbuttonclick(){
        guest_btn=(Button)findViewById(R.id.guest_btn);
        signup_with_email_btn=(Button)findViewById(R.id.signup_with_email_btn);


        guest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginFirst.this,navigation_drawer.class);
                startActivity(intent);
            }
        });

        signup_with_email_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginFirst.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

}
