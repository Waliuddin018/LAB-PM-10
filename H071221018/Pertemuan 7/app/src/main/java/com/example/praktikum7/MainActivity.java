package com.example.praktikum7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNIM, editTextPassword;
    private Button buttonLogin, buttonRegister;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNIM = findViewById(R.id.editTextNIM);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);

        boolean isLoggedIn = sharedPreferences.getBoolean("loggedIn", false);
        if (isLoggedIn) {
            startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
            finish();
        }

        buttonLogin.setOnClickListener(view -> {
            String nim = editTextNIM.getText().toString();
            String password = editTextPassword.getText().toString();

            if (nim.isEmpty()) {
                editTextNIM.setError("Please fill this field");
            } else if (password.isEmpty()) {
                editTextPassword.setError("Please fill this field");
            } else {
                String savedNIM = sharedPreferences.getString("NIM", "");
                String savedPassword = sharedPreferences.getString("Password", "");

                if (nim.equals(savedNIM) && password.equals(savedPassword)) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("loggedIn", true);
                    editor.apply();

                    startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Login gagal. Periksa kembali NIM dan password Anda.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonRegister.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
