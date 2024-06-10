package com.example.praktikum7;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    private TextView textViewWelcome;
    private Button buttonLogout,buttonSetting;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textViewWelcome = findViewById(R.id.textViewWelcome);
        buttonLogout = findViewById(R.id.buttonLogout);
        buttonSetting = findViewById(R.id.buttonSetting);

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);

        String nim = sharedPreferences.getString("NIM", "");
        textViewWelcome.setText("Selamat Datang, " + nim + "!");

        buttonLogout.setOnClickListener(view -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove("loggedIn");
            editor.apply();

            Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        buttonSetting.setOnClickListener(view -> {
            Intent intent = new Intent(WelcomeActivity.this, SettingActivity.class);
            startActivity(intent);
        });
    }
}

