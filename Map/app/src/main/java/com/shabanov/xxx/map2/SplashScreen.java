package com.shabanov.xxx.map2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    private final int S_D_L=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mIntent);
                SplashScreen.this.finish();
                }
            },S_D_L);
        }
        @Override
    public void onBackPressed(){
            super.onBackPressed();
        }
    }
