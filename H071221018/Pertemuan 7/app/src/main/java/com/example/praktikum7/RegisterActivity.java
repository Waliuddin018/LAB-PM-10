package com.example.praktikum7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextNIM;
    private EditText editTextPassword;
    private SharedPreferences sharedPreferences;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sharedPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);

        editTextNIM = findViewById(R.id.editTextNIM);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(view -> {
            String nim = editTextNIM.getText().toString();
            String password = editTextPassword.getText().toString();

            if (nim.isEmpty()) {
                editTextNIM.setError("Please fill this field");
            } else if (password.isEmpty()) {
                editTextPassword.setError("Please fill this field");
            } else {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NIM", nim);
                editor.putString("Password", password);
                editor.apply();

                Toast.makeText(RegisterActivity.this, "Registrasi berhasil", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
