package com.example.praktikum_3;

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
        TextView tvProfile = findViewById(R.id.Tv_profile);
        TextView tvAngkaFollowers = findViewById(R.id.Tv_followers);
        TextView tvAngkaFollowing = findViewById(R.id.Tv_following);
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
            if(fotoProfile == R.drawable.voldemort){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                Storyintent.putExtra("NAMA PROFILE", "voldemort678");
                Storyintent.putExtra("STORY",R.drawable.snap1);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.harry){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.harry);
                Storyintent.putExtra("NAMA PROFILE", "harrypotter");
                Storyintent.putExtra("STORY",R.drawable.snap2);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.malfoy){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                Storyintent.putExtra("NAMA PROFILE", "dracomalfoy");
                Storyintent.putExtra("STORY",R.drawable.snap3);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.minerva){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.minerva);
                Storyintent.putExtra("NAMA PROFILE", "minervamcgonagall");
                Storyintent.putExtra("STORY",R.drawable.snap4);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.dumbledore){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                Storyintent.putExtra("NAMA PROFILE", "prof.dumbledore");
                Storyintent.putExtra("STORY",R.drawable.snap5);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.hermoni){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                Storyintent.putExtra("NAMA PROFILE", "ms.granger");
                Storyintent.putExtra("STORY",R.drawable.snap6);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.ron){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.ron);
                Storyintent.putExtra("NAMA PROFILE", "ronniegonnie");
                Storyintent.putExtra("STORY",R.drawable.snap7);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.neville){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.neville);
                Storyintent.putExtra("NAMA PROFILE", "nevlongbottom");
                Storyintent.putExtra("STORY",R.drawable.snap8);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.sirius){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.sirius);
                Storyintent.putExtra("NAMA PROFILE", "siriusblack");
                Storyintent.putExtra("STORY",R.drawable.snap9);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.snape){
                Intent Storyintent = new Intent(ProfileActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.snape);
                Storyintent.putExtra("NAMA PROFILE", "prof.snape");
                Storyintent.putExtra("STORY",R.drawable.snap10);
                startActivity(Storyintent);
            }
        });

        ivPost.setOnClickListener(v -> {
            if (postingan == R.drawable.gambar1) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.voldemort);
                storyIntent.putExtra("USERNAME", "voldemort678");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar1);
                storyIntent.putExtra("DESKRIPSI", "Hogwarts night");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar2) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.harry);
                storyIntent.putExtra("USERNAME", "harrypotter");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar2);
                storyIntent.putExtra("DESKRIPSI", "Ronnie with his sorting hat");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gamabr3) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.malfoy);
                storyIntent.putExtra("USERNAME", "dracomalfoy");
                storyIntent.putExtra("POSTINGAN", R.drawable.gamabr3);
                storyIntent.putExtra("DESKRIPSI", "Slytherin pride");
                startActivity(storyIntent);
            }if (postingan == R.drawable.gambar4) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.minerva);
                storyIntent.putExtra("USERNAME", "minervamcgonagall");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar4);
                storyIntent.putExtra("DESKRIPSI", "piertotum locomotor");
                startActivity(storyIntent);
            }if (postingan == R.drawable.gambar5) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.dumbledore);
                storyIntent.putExtra("USERNAME", "prof.dumbledore");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar5);
                storyIntent.putExtra("DESKRIPSI", "never be so clever you forget to be kind");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar6) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.hermoni);
                storyIntent.putExtra("USERNAME", "ms.granger");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar6);
                storyIntent.putExtra("DESKRIPSI", "just a hogwarts");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar7) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.ron);
                storyIntent.putExtra("USERNAME", "ronniegonnie");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar7);
                storyIntent.putExtra("DESKRIPSI", "that should be me");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar8) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.neville);
                storyIntent.putExtra("USERNAME", "nevlongbottom");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar8);
                storyIntent.putExtra("DESKRIPSI", "warm kisses");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar9) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.sirius);
                storyIntent.putExtra("USERNAME", "siriusblack");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar9);
                storyIntent.putExtra("DESKRIPSI", "poor bellatrix");
                startActivity(storyIntent);
            } if (postingan == R.drawable.gambar10) {
                Intent storyIntent = new Intent(ProfileActivity.this, PostinganActivity.class);
                storyIntent.putExtra("FOTO PROFILE", R.drawable.snape);
                storyIntent.putExtra("USERNAME", "prof.snape");
                storyIntent.putExtra("POSTINGAN", R.drawable.gambar10);
                storyIntent.putExtra("DESKRIPSI", "plan to fail");
                startActivity(storyIntent);
            }
        });
    }
}
