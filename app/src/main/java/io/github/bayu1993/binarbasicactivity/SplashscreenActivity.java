package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashscreenActivity extends AppCompatActivity {
    private final int TIMEDURATION = 3000;
    private final String PREFERENCESNAME = "MySharePreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        //read
        final boolean cekOnBoardingActivity;
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCESNAME,MODE_PRIVATE);
        cekOnBoardingActivity = sharedPreferences.getBoolean("cekOnboarding",false);
        Log.d("cek On boarding", "status : "+cekOnBoardingActivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (cekOnBoardingActivity){
                    Intent intentToOnboarding = new Intent(SplashscreenActivity.this,MainActivity.class);
                    startActivity(intentToOnboarding);
                    finish();
                }else {
                    Intent intentToMain = new Intent(SplashscreenActivity.this,OnboardingActivity.class);
                    startActivity(intentToMain);
                    finish();
                }
            }
        },TIMEDURATION);
    }
}
