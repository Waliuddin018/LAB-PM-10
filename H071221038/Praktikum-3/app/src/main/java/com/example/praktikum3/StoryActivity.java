package com.example.praktikum3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryActivity extends AppCompatActivity {

    CircleImageView civ_profile;
    TextView tv_username;
    ImageView iv_story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        civ_profile = findViewById(R.id.civ_profile);
        tv_username = findViewById(R.id.tv_username);
        iv_story = findViewById(R.id.iv_story);

        Account account = getIntent().getParcelableExtra("kirim_story");
        civ_profile.setImageResource(account.getProfile());
        tv_username.setText(String.valueOf(account.getUsername()));
        iv_story.setImageResource(account.getStory());

        civ_profile.setOnClickListener(view -> onItemClicked(account));
        tv_username.setOnClickListener(view -> onItemClicked(account));

    }
    public void onItemClicked(Account account) {
        Intent intent = new Intent(StoryActivity.this, ProfileActivity.class);
        intent.putExtra("kirim_profile",account);
        startActivity(intent);
    }
}