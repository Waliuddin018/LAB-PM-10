package com.example.tugaspraktikum3;

import static com.example.tugaspraktikum3.DataSource.stories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {

    private ImageView ivProfile, imageStory;
    private TextView tvProfile, tvUser;
    private Context context;

    private ArrayList<Posting> postings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ivProfile = findViewById(R.id.iv_profile2);
        tvProfile = findViewById(R.id.tv_profile2);
        imageStory = findViewById(R.id.imageStory);

        Intent intent2 = getIntent();

        int fotoProfile = intent2.getIntExtra("FOTO PROFILE",0);
        String namaProfile = intent2.getStringExtra("NAMA PROFILE");
        int fotoStory = intent2.getIntExtra("STORY", 0);

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        imageStory.setImageResource(fotoStory);

        tvProfile.setOnClickListener(v -> {
            if (namaProfile.equals("Enhypen")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.logoenha);
                profileIntent.putExtra("NAMA PROFILE", "Enhypen");
                profileIntent.putExtra("FOLLOWERS", "16 M");
                profileIntent.putExtra("FOLLOWING", "2");
                profileIntent.putExtra("POSTINGAN", R.drawable.ethan);
                startActivity((profileIntent));
            }if (namaProfile.equals("Zerobaseone")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.logozb);
                profileIntent.putExtra("NAMA PROFILE", "Zerobaseone");
                profileIntent.putExtra("FOLLOWERS", "3 M");
                profileIntent.putExtra("FOLLOWING", "2");
                profileIntent.putExtra("POSTINGAN", R.drawable.ricky);
                startActivity((profileIntent));
            }if (namaProfile.equals("Dowoon.drum")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logodoun);
                profileIntent.putExtra("NAMA PROFILE","Dowoon.drum");
                profileIntent.putExtra("FOLLOWERS","1.1 M");
                profileIntent.putExtra("FOLLOWING","114");
                profileIntent.putExtra("POSTINGAN", R.drawable.doun);
                startActivity((profileIntent));
            }if (namaProfile.equals("Kazuha")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logokazuha);
                profileIntent.putExtra("NAMA PROFILE","Kazuha");
                profileIntent.putExtra("FOLLOWERS","7.4 M");
                profileIntent.putExtra("FOLLOWING","5");
                profileIntent.putExtra("POSTINGAN", R.drawable.kazuha);
                startActivity((profileIntent));
            }if (namaProfile.equals("Karina")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logokarina);
                profileIntent.putExtra("NAMA PROFILE","Karina");
                profileIntent.putExtra("FOLLOWERS","13.8 M");
                profileIntent.putExtra("FOLLOWING","4");
                profileIntent.putExtra("POSTINGAN", R.drawable.karina);
                startActivity((profileIntent));
            }if (namaProfile.equals("eajpark")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.eajlogo);
                profileIntent.putExtra("NAMA PROFILE","eajpark");
                profileIntent.putExtra("FOLLOWERS","1.4 M");
                profileIntent.putExtra("FOLLOWING","84");
                profileIntent.putExtra("POSTINGAN", R.drawable.eaj);
                startActivity((profileIntent));
            }if (namaProfile.equals("dprian")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logoian);
                profileIntent.putExtra("NAMA PROFILE","dprian");
                profileIntent.putExtra("FOLLOWERS","4.1 M");
                profileIntent.putExtra("FOLLOWING","22");
                profileIntent.putExtra("POSTINGAN", R.drawable.ian);
                startActivity((profileIntent));
            }if (namaProfile.equals("Yuna")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logoyuna);
                profileIntent.putExtra("NAMA PROFILE","Yuna");
                profileIntent.putExtra("FOLLOWERS","2.2 M");
                profileIntent.putExtra("FOLLOWING","5");
                profileIntent.putExtra("POSTINGAN", R.drawable.yuna);
                startActivity((profileIntent));
            }if (namaProfile.equals("Newjeans")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logonj);
                profileIntent.putExtra("NAMA PROFILE","Newjeans");
                profileIntent.putExtra("FOLLOWERS","11.8 M");
                profileIntent.putExtra("FOLLOWING","2");
                profileIntent.putExtra("POSTINGAN", R.drawable.nj);
                startActivity((profileIntent));
            }if (namaProfile.equals("Yeonjun")) {
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.logoyeonjun);
                profileIntent.putExtra("NAMA PROFILE","Yeonjun");
                profileIntent.putExtra("FOLLOWERS","17.5 M");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN", R.drawable.yeonjun);
                startActivity((profileIntent));
            }
        });
}}
