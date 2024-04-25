package com.example.praktikum3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView li2_iv_profile;
    TextView li2_tv_username;
    ImageView li2_iv_post;
    TextView li2_tv_caption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        li2_iv_profile = findViewById(R.id.li2_iv_profile);
        li2_tv_username = findViewById(R.id.li2_tv_username);
        li2_iv_post = findViewById(R.id.li2_iv_post);
        li2_tv_caption = findViewById(R.id.li2_tv_caption);

        Account account = getIntent().getParcelableExtra("kirim_post");
        li2_iv_profile.setImageResource(account.getProfile());
        li2_tv_username.setText(String.valueOf(account.getUsername()));
        li2_iv_post.setImageResource(account.getPost());
        li2_tv_caption.setText(String.valueOf(account.getCaption()));

        li2_iv_profile.setOnClickListener(view -> onItemClicked(account));
        li2_tv_username.setOnClickListener(view -> onItemClicked2(account));


    }

    public void onItemClicked(Account account) {
        finish();
    }
    public void onItemClicked2(Account account) {
        finish();
    }
}