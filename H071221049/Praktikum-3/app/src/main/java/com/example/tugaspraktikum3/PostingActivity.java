package com.example.tugaspraktikum3;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostingActivity extends Activity {

    private ImageView ivProfile, ivPost;

    private TextView tvUsername, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        ivProfile = findViewById(R.id.iv_profile);
        tvUsername = findViewById(R.id.tv_user);
        ivPost = findViewById(R.id.iv_post);
        tvDesc = findViewById(R.id.tv_desc);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE",0);
        String username = intent.getStringExtra("USERNAME");
        int postingan = intent.getIntExtra("POSTINGAN", 0);
        String desc = intent.getStringExtra("DESKRIPSI");

        ivProfile.setImageResource(fotoProfile);
        tvUsername.setText(username);
        ivPost.setImageResource(postingan);
        tvDesc.setText(desc);

        ivProfile.setOnClickListener(v -> {
            if(fotoProfile == R.drawable.logoenha){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logoenha);
                Storyintent.putExtra("NAMA PROFILE", "Enhypen");
                Storyintent.putExtra("STORY",R.drawable.ethan);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logozb){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logozb);
                Storyintent.putExtra("NAMA PROFILE", "Zerobaseone");
                Storyintent.putExtra("STORY",R.drawable.ricky);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logodoun){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logodoun);
                Storyintent.putExtra("NAMA PROFILE", "Dowoon.drum");
                Storyintent.putExtra("STORY",R.drawable.doun);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logokazuha){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logokazuha);
                Storyintent.putExtra("NAMA PROFILE", "Kazuha");
                Storyintent.putExtra("STORY",R.drawable.kazuha);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logokarina){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logokarina);
                Storyintent.putExtra("NAMA PROFILE", "Karina");
                Storyintent.putExtra("STORY",R.drawable.karina);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.eajlogo){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.eajlogo);
                Storyintent.putExtra("NAMA PROFILE", "eajpark");
                Storyintent.putExtra("STORY",R.drawable.eaj);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logoian){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logoian);
                Storyintent.putExtra("NAMA PROFILE", "dprian");
                Storyintent.putExtra("STORY",R.drawable.ian);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logoyuna){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logoyuna);
                Storyintent.putExtra("NAMA PROFILE", "Yuna");
                Storyintent.putExtra("STORY",R.drawable.yuna);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logonj){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logonj);
                Storyintent.putExtra("NAMA PROFILE", "Newjeans");
                Storyintent.putExtra("STORY",R.drawable.nj);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.logoyeonjun){
                Intent Storyintent = new Intent(PostingActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.logoyeonjun);
                Storyintent.putExtra("NAMA PROFILE", "Yeonjun");
                Storyintent.putExtra("STORY",R.drawable.yeonjun);
                startActivity(Storyintent);
            }
        });

        tvUsername.setOnClickListener(v -> {
            String name = tvUsername.getText().toString();
            Intent intent4 = new Intent(PostingActivity.this, ProfileActivity.class);
            intent.putExtra("nama-profil", name);

            switch(name){
                case "Enhypen":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logoenha);
                    intent4.putExtra("USERNAME", "Enhypen");
                    intent4.putExtra("POSTINGAN", R.drawable.ethan);
                    intent4.putExtra("DESKRIPSI", "Stay tuned, guys!!");
                    break;
                case "Zerobaseone":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logozb);
                    intent4.putExtra("USERNAME", "Zerobaseone");
                    intent4.putExtra("POSTINGAN", R.drawable.ricky);
                    intent4.putExtra("DESKRIPSI", "Good night, bestie!!");
                    break;
                case "Dowoon.drum":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logodoun);
                    intent4.putExtra("USERNAME", "Dowoon.drum");
                    intent4.putExtra("POSTINGAN", R.drawable.doun);
                    intent4.putExtra("DESKRIPSI", "Habis jalan-jalan keliling komplek nih, cape banget");
                    break;
                case "Kazuha":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logokazuha);
                    intent4.putExtra("USERNAME", "Kazuha");
                    intent4.putExtra("POSTINGAN", R.drawable.kazuha);
                    intent4.putExtra("DESKRIPSI", "Malming di rumah bosen banget euy");
                    break;
                case "Karina":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logokarina);
                    intent4.putExtra("USERNAME", "Karina");
                    intent4.putExtra("POSTINGAN", R.drawable.karina);
                    intent4.putExtra("DESKRIPSI", "Jalan - jalan ke negara tetangga dulu, hihi");
                    break;
                case "eajpark":
                    intent4.putExtra("FOTO PROFILE", R.drawable.eajlogo);
                    intent4.putExtra("USERNAME", "eajpark");
                    intent4.putExtra("POSTINGAN", R.drawable.eaj);
                    intent4.putExtra("DESKRIPSI", "Thank you HITC, You were amazing!!");
                    break;
                case "dprian":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logoian);
                    intent4.putExtra("USERNAME", "dprian");
                    intent4.putExtra("POSTINGAN", R.drawable.ian);
                    intent4.putExtra("DESKRIPSI", "First time in Milan but certainly not going to be my last");
                    break;
                case "Yuna":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logoyuna);
                    intent4.putExtra("USERNAME", "Yuna");
                    intent4.putExtra("POSTINGAN", R.drawable.yuna);
                    intent4.putExtra("DESKRIPSI", "Sekolah dulu guys!! Belajar yang rajin, jangan suka bolos ya");
                    break;
                case "Newjeans":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logonj);
                    intent4.putExtra("USERNAME", "Newjeans");
                    intent4.putExtra("POSTINGAN", R.drawable.nj);
                    intent4.putExtra("DESKRIPSI", "Yuhuu akhirnya bisa full team lagi!! Udah lama ga nongki berlima");
                    break;
                case "Yeonjun":
                    intent4.putExtra("FOTO PROFILE", R.drawable.logoyeonjun);
                    intent4.putExtra("USERNAME", "Yeonjun");
                    intent4.putExtra("POSTINGAN", R.drawable.yeonjun);
                    intent4.putExtra("DESKRIPSI", "Karena gue merasa ganteng banget disini, jadi mirror selfie dulu ga sih?");
                    break;
            }
            startActivity(intent4);
        });
    }

}

