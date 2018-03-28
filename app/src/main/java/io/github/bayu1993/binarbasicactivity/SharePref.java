package io.github.bayu1993.binarbasicactivity;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dell on 3/27/18.
 */

public class SharePref {
    public static final String PREFERENCE_NAME = "PREFERENCE_DATA";
    private final SharedPreferences sharedpreferences;

    public SharePref(Context context) {
        sharedpreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public boolean getStatus() {
        return sharedpreferences.getBoolean("statusOnBoarding", false);
    }

    public void setStatus() {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean("statusOnBoarding", true);
        editor.apply();
    }
}
