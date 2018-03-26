package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingActivity extends AppCompatActivity {
    private final String PREFERENCESNAME = "MySharePreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        SharedPreferences settings = getSharedPreferences(PREFERENCESNAME, MODE_PRIVATE);
        Button btnNext = (Button)findViewById(R.id.btn_next);
        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("cekOnboarding", true);
        editor.commit();
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext = new Intent(OnboardingActivity.this,MainActivity.class);
                startActivity(intentNext);
                finish();
            }
        });
    }
}
