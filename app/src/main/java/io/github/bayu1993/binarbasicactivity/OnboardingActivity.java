package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingActivity extends AppCompatActivity {
    private Button btnNext;
    private SharePref sharePref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide toolbar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_onboarding);

        initView();
        sharePref.setStatus();
        //event onclick
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(OnboardingActivity.this,MainActivity.class);
                startActivity(intentNext);
                finish();
            }
        });
    }

    private void initView() {
        //instansiasi
        sharePref = new SharePref(this);
        btnNext = findViewById(R.id.btn_next);
    }
}
