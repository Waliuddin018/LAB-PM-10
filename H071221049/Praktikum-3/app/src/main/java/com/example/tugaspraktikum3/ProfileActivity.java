package com.example.tugaspraktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvProfile = findViewById(R.id.tvProfile);
        TextView tvAngkaFollowers = findViewById(R.id.tvFollowers);
        TextView tvAngkaFollowing = findViewById(R.id.tvFollowing);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE", 0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        String angkaFollowers = intent.getStringExtra("FOLLOWERS");
        String angkaFollowing = intent.getStringExtra("FOLLOWING");
        int postingan = intent.getIntExtra("POSTINGAN", 0);

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        tvAngkaFollowers.setText(angkaFollowers);
        tvAngkaFollowing.setText(angkaFollowing);
        ivPost.setImageResource(postingan);

        ivProfile.setOnClickListener(v -> {
            if (fotoProfile == R.drawable.logoenha) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoenha);
                storyIntent.putExtra("NAMA PROFILE", "Enhypen");
                storyIntent.putExtra("STORY", R.drawable.ethan);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logozb) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logozb);
                storyIntent.putExtra("NAMA PROFILE", "Zerobaseone");
                storyIntent.putExtra("STORY", R.drawable.ricky);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logodoun) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logodoun);
                storyIntent.putExtra("NAMA PROFILE", "Dowoon.drum");
                storyIntent.putExtra("STORY", R.drawable.doun);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logokazuha) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logokazuha);
                storyIntent.putExtra("NAMA PROFILE", "Kazuha");
                storyIntent.putExtra("STORY", R.drawable.kazuha);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logokarina) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logokarina);
                storyIntent.putExtra("NAMA PROFILE", "Karina");
                storyIntent.putExtra("STORY", R.drawable.karina);
                startActivity(storyIntent);
            }  if (fotoProfile == R.drawable.eajlogo) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.eajlogo);
                storyIntent.putExtra("NAMA PROFILE", "eajpark");
                storyIntent.putExtra("STORY", R.drawable.eaj);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logoian) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoian);
                storyIntent.putExtra("NAMA PROFILE", "dprian");
                storyIntent.putExtra("STORY", R.drawable.ian);
                startActivity(storyIntent);
            } if (fotoProfile == R.drawable.logoyuna) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoyuna);
                storyIntent.putExtra("NAMA PROFILE", "Yuna");
                storyIntent.putExtra("STORY", R.drawable.yuna);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.logonj) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logonj);
                storyIntent.putExtra("NAMA PROFILE", "Newjeans");
                storyIntent.putExtra("STORY", R.drawable.nj);
                startActivity(storyIntent);
            } else if (fotoProfile == R.drawable.logoyeonjun) {
                Intent storyIntent = new Intent(ProfileActivity.this, StoryActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoyeonjun);
                storyIntent.putExtra("NAMA PROFILE", "Yeonjun");
                storyIntent.putExtra("STORY", R.drawable.yeonjun);
                startActivity(storyIntent);
            }
        });

        ivPost.setOnClickListener(v -> {
            if (postingan == R.drawable.ethan) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoenha);
                storyIntent.putExtra("USERNAME", "Enhypen");
                storyIntent.putExtra("POSTINGAN", R.drawable.ethan);
                storyIntent.putExtra("DESKRIPSI", "Stay tuned, guys!!");
                startActivity(storyIntent);
            } if (postingan == R.drawable.ricky) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logozb);
                storyIntent.putExtra("USERNAME", "Zerobaseone");
                storyIntent.putExtra("POSTINGAN", R.drawable.ricky);
                storyIntent.putExtra("DESKRIPSI", "Good night, bestie!!");
                startActivity(storyIntent);
            } if (postingan == R.drawable.doun) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logodoun);
                storyIntent.putExtra("USERNAME", "Dowoon.drum");
                storyIntent.putExtra("POSTINGAN", R.drawable.doun);
                storyIntent.putExtra("DESKRIPSI", "Habis jalan-jalan keliling komplek nih, cape banget");
                startActivity(storyIntent);
            }if (postingan == R.drawable.kazuha) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logokazuha);
                storyIntent.putExtra("USERNAME", "Kazuha");
                storyIntent.putExtra("POSTINGAN", R.drawable.kazuha);
                storyIntent.putExtra("DESKRIPSI", "Malming di rumah bosen banget euy");
                startActivity(storyIntent);
            }if (postingan == R.drawable.karina) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logokarina);
                storyIntent.putExtra("USERNAME", "Karina");
                storyIntent.putExtra("POSTINGAN", R.drawable.karina);
                storyIntent.putExtra("DESKRIPSI", "Jalan - jalan ke negara tetangga dulu, hihi");
                startActivity(storyIntent);
            } if (postingan == R.drawable.eaj) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.eajlogo);
                storyIntent.putExtra("USERNAME", "eajpark");
                storyIntent.putExtra("POSTINGAN", R.drawable.eaj);
                storyIntent.putExtra("DESKRIPSI", "Thank you HITC, You were amazing!!");
                startActivity(storyIntent);
            } if (postingan == R.drawable.ian) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoian);
                storyIntent.putExtra("USERNAME", "dprian");
                storyIntent.putExtra("POSTINGAN", R.drawable.ian);
                storyIntent.putExtra("DESKRIPSI", "First time in Milan but certainly not going to be my last");
                startActivity(storyIntent);
            } if (postingan == R.drawable.yuna) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoyuna);
                storyIntent.putExtra("USERNAME", "Yuna");
                storyIntent.putExtra("POSTINGAN", R.drawable.yuna);
                storyIntent.putExtra("DESKRIPSI", "Sekolah dulu guys!! Belajar yang rajin, jangan suka bolos ya");
                startActivity(storyIntent);
            } if (postingan == R.drawable.nj) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logonj);
                storyIntent.putExtra("USERNAME", "Newjeans");
                storyIntent.putExtra("POSTINGAN", R.drawable.nj);
                storyIntent.putExtra("DESKRIPSI", "Yuhuu akhirnya bisa full team lagi!! Udah lama ga nongki berlima");
                startActivity(storyIntent);
            } if (postingan == R.drawable.yeonjun) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostingActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.logoyeonjun);
                storyIntent.putExtra("USERNAME", "Yeonjun");
                storyIntent.putExtra("POSTINGAN", R.drawable.yeonjun);
                storyIntent.putExtra("DESKRIPSI", "Karena gue merasa ganteng banget disini, jadi mirror selfie dulu ga sih?");
                startActivity(storyIntent);
            }
        });
    }
}

