package com.example.utplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class LoginMenuActivity extends AppCompatActivity {
    private TextView skipBtn;
    private Animation blinkAnimation;
    private Button loginBtn,registBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);
        skipBtn=findViewById(R.id.skip_btn_login);
        registBtn=findViewById(R.id.SignupBtn);



        blinkAnimation= AnimationUtils.loadAnimation(
                this,R.anim.blinkanimation
        );
        skipBtn.setAnimation(blinkAnimation);


        skipBtn.setOnClickListener(view -> {
            Intent HomeIntent=new Intent(LoginMenuActivity.this,HomeActivity.class);
            startActivity(HomeIntent);
            finish();
        });

        registBtn.setOnClickListener( view ->{
                Intent registerIntent=new Intent(LoginMenuActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
                finish();
        });





    }
}