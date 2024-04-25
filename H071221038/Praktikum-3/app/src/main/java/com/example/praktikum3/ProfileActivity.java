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

public class ProfileActivity extends AppCompatActivity {

    CircleImageView ap_civ_profile;
    TextView ap_tv_username;
    TextView ap_tv_followersnum;
    TextView ap_tv_followingnum;
    ImageView ap_iv_post;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        ap_civ_profile = findViewById(R.id.ap_civ_profile);
        ap_tv_username = findViewById(R.id.ap_tv_username);
        ap_tv_followersnum = findViewById(R.id.ap_tv_followersnum);
        ap_tv_followingnum = findViewById(R.id.ap_tv_followingnum);
        ap_iv_post = findViewById(R.id.ap_iv_post);

        Account account = getIntent().getParcelableExtra("kirim_profile");
        ap_civ_profile.setImageResource(account.getProfile());
        ap_tv_username.setText(String.valueOf(account.getUsername()));
        ap_tv_followersnum.setText(String.valueOf((account.getFollowers())));
        ap_tv_followingnum.setText(String.valueOf((account.getFollowing())));
        ap_iv_post.setImageResource(account.getPost());

        ap_civ_profile.setOnClickListener(view -> onItemClicked(account));
        ap_iv_post.setOnClickListener(view -> onItemClicked2(account));

    }

    public void onItemClicked(Account account) {
        Intent intent = new Intent(ProfileActivity.this, StoryActivity.class);
        intent.putExtra("kirim_story", account);
        startActivity(intent);
    }
    public void onItemClicked2(Account account) {
        Intent intent = new Intent(ProfileActivity.this, DetailActivity.class);
        intent.putExtra("kirim_post", account);
        startActivity(intent);
    }


}