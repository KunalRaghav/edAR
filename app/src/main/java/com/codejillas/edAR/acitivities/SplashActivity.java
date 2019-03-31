package com.codejillas.edAR.acitivities;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;


import com.codejillas.edAR.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences prefs = null;
    View view =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        view = this.findViewById(R.id.imageView);
        prefs = getSharedPreferences("com.krsolutions.tardy", MODE_PRIVATE);
    }

    void scheduleSplash(Context base,View view){
        Long splashDuration=getSplashDuration();
        Handler handler = new Handler();
        handler.postDelayed(routeToMain(base, view),splashDuration);
    }

    Long getSplashDuration(){return 500L;}

    Runnable routeToMain(final Context base, final View view){
        return new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(base,MainActivity.class);
                    ActivityOptions options =
                            ActivityOptions.makeClipRevealAnimation(view,(int)view.getX(),(int)view.getY(),view.getWidth(),100);
                    base.startActivity(intent, options.toBundle());
                    finish();

            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        scheduleSplash(this,view);

    }
}
