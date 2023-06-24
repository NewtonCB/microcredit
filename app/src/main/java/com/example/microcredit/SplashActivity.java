package com.example.microcredit;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DURATION = 2000; // Splash screen duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_mian);

        // Delay for a few seconds before redirecting to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an intent to launch the main activity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close the splash activity to prevent the user from going back to it
            }
        }, SPLASH_DURATION);
    }
}


