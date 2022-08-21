package com.example.dollarapp.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dollarapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Chama a activity de login após a cotação do dólar
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                loadLoginActivity();
            }
        }, 2000);
    }

    public void loadLoginActivity() {
        Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}