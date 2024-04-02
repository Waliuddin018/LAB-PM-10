package com.example.praktikum_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edTittle, edContent;
    Button buttonSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edTittle = findViewById(R.id.edittext_title);
        edContent = findViewById(R.id.edittext_content);
        buttonSave = findViewById(R.id.save);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String image = getIntent().getStringExtra("image");
                String input_name = getIntent().getStringExtra("name");
                String input_username = getIntent().getStringExtra("username");
                String input_title = edTittle.getText().toString();
                String input_content = edContent.getText().toString();

                if (!input_title.isEmpty() && !input_content.isEmpty()) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("image", image);
                    intent.putExtra("name", input_name);
                    intent.putExtra("username", input_username);
                    intent.putExtra("title", input_title);
                    intent.putExtra("content", input_content);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity2.this, "Harap isi kedua kolom", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed(); // Kembali ke halaman sebelumnya
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}