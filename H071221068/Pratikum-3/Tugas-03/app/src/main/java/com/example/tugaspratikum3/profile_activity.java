package com.example.tugaspratikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class profile_activity extends AppCompatActivity {

    private ImageView ivprofile, ivpost;

    private TextView tvprofile, tvnumberfollower, tvnumberfollowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ivprofile = findViewById(R.id.ivProfile);
        tvprofile = findViewById(R.id.tv_profile);
        tvnumberfollower = findViewById(R.id.tv_numberoffollower);
        tvnumberfollowing = findViewById(R.id.numberoffollowing);
        ivpost = findViewById(R.id.iv_post);

        Intent intent = getIntent();

        int fotoprofil = intent.getIntExtra("foto_profil", 0);
        String namaprofil = intent.getStringExtra("nama_profil");
        String angkafollower = intent.getStringExtra("followers");
        String angkafollowing = intent.getStringExtra("following");
        int fotopostingan = intent.getIntExtra("postingan", 0);

        ivprofile.setImageResource(fotoprofil);
        tvprofile.setText(namaprofil);
        tvnumberfollower.setText(angkafollower);
        tvnumberfollowing.setText(angkafollowing);
        ivpost.setImageResource(fotopostingan);

        ivpost.setOnClickListener(v -> {
            if(fotopostingan == R.drawable.lifeatgojekpost){
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.lifeatgojekprofil);
                postintent.putExtra("name", "lifeatgojek");
                postintent.putExtra("post", R.drawable.lifeatgojekpost);
                postintent.putExtra("description", "Welcome to life at gojek! discover stories about our key learnings, culture, opportunities, and GoTroops around the globe. Come along for the ride!");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.lifeatkallapost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.lifeatkallaprofil);
                postintent.putExtra("name", "lifeatkalla");
                postintent.putExtra("post", R.drawable.lifeatkallapost);
                postintent.putExtra("description", "Great place to work, Good place to start with kalla group");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.lifeatfmcgpost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.lifeatfmcgprofil);
                postintent.putExtra("name", "lifeatfmcg");
                postintent.putExtra("post", R.drawable.lifeatfmcgpost);
                postintent.putExtra("description", "Empowering FMCG careers in indonesia, skill development, networking, and opportunities");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.lifeatrgpost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.lifeatrgprofil);
                postintent.putExtra("name", "lifeatruangguru");
                postintent.putExtra("post", R.drawable.lifeatrgpost);
                postintent.putExtra("description", "Yuk intip kehidupan di start up edutech terbesar di Indonesia dan Asia Tenggara");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.lifeatshoopepost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.lifeatshoopeprofil);
                postintent.putExtra("name", "lifeatshopee");
                postintent.putExtra("post", R.drawable.lifeatshoopepost);
                postintent.putExtra("description", "make online shopping easy & enjoyable with our greatest assest");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.unhaspost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.unhasprofil);
                postintent.putExtra("name", "Hasanuddin_Univ");
                postintent.putExtra("post", R.drawable.unhaspost);
                postintent.putExtra("description", "Perguruan Tinggi & Universitas, Unhasku Bersatu, Unhasku kuat");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.yonseipost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.yonseiprofil);
                postintent.putExtra("name", "uicyonsei");
                postintent.putExtra("post", R.drawable.yonseipost);
                postintent.putExtra("description", "Underwood International College, Yonsei University Official Instagram Account");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.harvardpost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.harvardprofil);
                postintent.putExtra("name", "harvard");
                postintent.putExtra("post", R.drawable.harvardpost);
                postintent.putExtra("description", "Sharing photos of hardvard on campus and around the world");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.uipost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.uiprofil);
                postintent.putExtra("name", "univ_indonesia");
                postintent.putExtra("post", R.drawable.uipost);
                postintent.putExtra("description", "Lets share your campus life using universitas indonesia");
                startActivity(postintent);
            } if(fotopostingan == R.drawable.itbpost) {
                Intent postintent = new Intent(profile_activity.this, post_activity.class);
                postintent.putExtra("profil", R.drawable.itbprofil);
                postintent.putExtra("name", "itb1920");
                postintent.putExtra("post", R.drawable.itbpost);
                postintent.putExtra("description", "the official account of Institut Teknologi Bandung");
                startActivity(postintent);
            }
        });

        ivprofile.setOnClickListener(v -> {
            int profil = fotoprofil;
            Intent intent4 = new Intent(profile_activity.this, activity_story.class);
            intent4.putExtra("profil_pic", profil);

            if (profil == R.drawable.lifeatgojekprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                intent4.putExtra("name_sg", "lifeatgojek");
                intent4.putExtra("story_sg", R.drawable.lifeatgojekstory);
            } else if (profil == R.drawable.lifeatkallaprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                intent4.putExtra("name_sg", "lifeatkalla");
                intent4.putExtra("story_sg", R.drawable.lifeatkallastory);
            } else if (profil == R.drawable.lifeatfmcgprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                intent4.putExtra("name_sg", "lifeatfmcg");
                intent4.putExtra("story_sg", R.drawable.lifeatfmcgstory);
            } else if (profil == R.drawable.lifeatrgprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                intent4.putExtra("name_sg", "lifeatruangguru");
                intent4.putExtra("story_sg", R.drawable.lifeatrgstory);
            } else if (profil == R.drawable.lifeatshoopeprofil) {
                intent4.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                intent4.putExtra("name_sg", "lifeatshoope");
                intent4.putExtra("story_sg", R.drawable.lifeatshoopestory);
            } else if (profil == R.drawable.unhasprofil) {
                intent4.putExtra("foto_profil", R.drawable.unhasprofil);
                intent4.putExtra("name_sg", "Hasanuddin_Univ");
                intent4.putExtra("story_sg", R.drawable.unhasstory);
            } else if (profil == R.drawable.yonseiprofil) {
                intent4.putExtra("foto_profil", R.drawable.yonseiprofil);
                intent4.putExtra("name_sg", "uicyonsei");
                intent4.putExtra("story_sg", R.drawable.yonseistory);
            } else if (profil == R.drawable.harvardprofil) {
                intent4.putExtra("foto_profil", R.drawable.harvardprofil);
                intent4.putExtra("name_sg", "harvard");
                intent4.putExtra("story_sg", R.drawable.harvardstory);
            } else if (profil == R.drawable.uiprofil) {
                intent4.putExtra("foto_profil", R.drawable.uiprofil);
                intent4.putExtra("name_sg", "univ_indonesia");
                intent4.putExtra("story_sg", R.drawable.uistory);
            } else if (profil == R.drawable.itbprofil) {
                intent4.putExtra("foto_profil", R.drawable.itbprofil);
                intent4.putExtra("name_sg", "itb1920");
                intent4.putExtra("story_sg", R.drawable.itbstory);
            }

            startActivity(intent4);
        });
    }


}




































