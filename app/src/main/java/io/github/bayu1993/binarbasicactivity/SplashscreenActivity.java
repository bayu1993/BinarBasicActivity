package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends AppCompatActivity {
    //timer 3s
    private static final int TIMEDURATION = 3000;
    private SharePref sharePref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        initView();
        //read
        final Boolean state = sharePref.getStatus();
        //handler splash selama 3s
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //condition kalo false masuk ke onboarding kalo true langsung masuk ke main
                if (state){
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

    private void initView() {
        sharePref = new SharePref(this);
    }
}
