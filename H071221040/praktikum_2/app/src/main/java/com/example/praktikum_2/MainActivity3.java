package com.example.praktikum_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tvname, tvusername, tvtittle, tvcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvname = findViewById(R.id.textview_name);
        tvusername = findViewById(R.id.textview_username);
        tvtittle = findViewById((R.id.textview_title));
        tvcontent = findViewById(R.id.textview_content);


        tvname.setText(getIntent().getStringExtra("name"));
        tvusername.setText(getIntent().getStringExtra("username"));
        tvtittle.setText(getIntent().getStringExtra("title"));
        tvcontent.setText(getIntent().getStringExtra("content"));

        ImageView imageView = findViewById(R.id.imageview);
        String imageUriString = getIntent().getStringExtra("image");
        Uri imageUri = Uri.parse(imageUriString);
        imageView.setImageURI(imageUri);

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