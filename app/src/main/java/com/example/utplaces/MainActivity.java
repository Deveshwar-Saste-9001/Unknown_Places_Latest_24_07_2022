package com.example.utplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ashokchakraImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ashokchakraImage =findViewById(R.id.ashokchakra_rotateimageview);
        Animation clk_rotate = AnimationUtils.loadAnimation(
                this,
                R.anim.rotateanimation
        );
        ashokchakraImage.startAnimation(clk_rotate);
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent loginMenuIntent=new Intent(MainActivity.this,LoginMenuActivity.class);
                startActivity(loginMenuIntent);
                finish();
            }
        },5000);


    }
}