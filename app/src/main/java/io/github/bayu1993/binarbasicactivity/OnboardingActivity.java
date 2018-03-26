package io.github.bayu1993.binarbasicactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingActivity extends AppCompatActivity {
    //name sharepreferences
    private final String PREFERENCESNAME = "MySharePreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide toolbar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_onboarding);
        //instansiasi
        Button btnNext = (Button)findViewById(R.id.btn_next);

        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCESNAME, MODE_PRIVATE);
        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("cekOnboarding", true);
        editor.commit();
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
}
