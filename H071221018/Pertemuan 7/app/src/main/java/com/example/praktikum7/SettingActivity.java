package com.example.praktikum7;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class SettingActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private Switch switchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        sharedPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);

        switchMode = findViewById(R.id.switchMode);

        boolean isDarkModeOn = sharedPreferences.getBoolean("isDarkModeOn", false);
        switchMode.setChecked(isDarkModeOn);

        setSwitchColor(isDarkModeOn);

        switchMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                setSwitchColor(true);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isDarkModeOn", true);
                editor.apply();
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                setSwitchColor(false);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isDarkModeOn", false);
                editor.apply();
            }
        });
    }

    private void setSwitchColor(boolean isDarkModeOn) {
        int thumbColor;
        int trackColor;

        if (isDarkModeOn) {
            thumbColor = getResources().getColor(R.color.switch_thumb_on);
            trackColor = getResources().getColor(R.color.switch_track_on);
        } else {
            thumbColor = getResources().getColor(R.color.switch_thumb_off);
            trackColor = getResources().getColor(R.color.switch_track_off);
        }

        switchMode.setThumbTintList(ColorStateList.valueOf(thumbColor));
        switchMode.setTrackTintList(ColorStateList.valueOf(trackColor));
    }
}
