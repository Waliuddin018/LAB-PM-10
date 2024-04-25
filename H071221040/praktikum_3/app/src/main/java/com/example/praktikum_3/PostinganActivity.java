package com.example.praktikum_3;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostinganActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postingan);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvUsername = findViewById(R.id.tv_user);
        ImageView ivPost = findViewById(R.id.iv_post);
        TextView tvDesc = findViewById(R.id.tv_desc);

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
            if(fotoProfile == R.drawable.voldemort){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                Storyintent.putExtra("NAMA PROFILE", "voldemort678");
                Storyintent.putExtra("STORY",R.drawable.snap1);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.harry){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.harry);
                Storyintent.putExtra("NAMA PROFILE", "harrypotter");
                Storyintent.putExtra("STORY",R.drawable.snap2);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.malfoy){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                Storyintent.putExtra("NAMA PROFILE", "dracomalfoy");
                Storyintent.putExtra("STORY",R.drawable.snap3);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.minerva){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.minerva);
                Storyintent.putExtra("NAMA PROFILE", "minervamcgonagall");
                Storyintent.putExtra("STORY",R.drawable.snap4);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.dumbledore){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                Storyintent.putExtra("NAMA PROFILE", "prof.dumbledore");
                Storyintent.putExtra("STORY",R.drawable.snap5);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.hermoni){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                Storyintent.putExtra("NAMA PROFILE", "ms.granger");
                Storyintent.putExtra("STORY",R.drawable.snap6);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.ron){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.ron);
                Storyintent.putExtra("NAMA PROFILE", "ronniegonnie");
                Storyintent.putExtra("STORY",R.drawable.snap7);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.neville){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.neville);
                Storyintent.putExtra("NAMA PROFILE", "nevlongbottom");
                Storyintent.putExtra("STORY",R.drawable.snap8);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.sirius){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.sirius);
                Storyintent.putExtra("NAMA PROFILE", "siriusblack");
                Storyintent.putExtra("STORY",R.drawable.snap9);
                startActivity(Storyintent);
            }if(fotoProfile == R.drawable.snape){
                Intent Storyintent = new Intent(PostinganActivity.this, StoryActivity.class);
                Storyintent.putExtra("FOTO PROFILE",R.drawable.snape);
                Storyintent.putExtra("NAMA PROFILE", "prof.snape");
                Storyintent.putExtra("STORY",R.drawable.snap10);
                startActivity(Storyintent);
            }
        });

        tvUsername.setOnClickListener(v -> {
            if(username.equals("voldemort678")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.voldemort);
                profileIntent.putExtra("NAMA PROFILE","Lord Voldemort");
                profileIntent.putExtra("FOLLOWERS","1,5 JT");
                profileIntent.putExtra("FOLLOWING","2");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar1);
                startActivity((profileIntent));
            }if(username.equals("harrypotter")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.harry);
                profileIntent.putExtra("NAMA PROFILE","Harry Potter");
                profileIntent.putExtra("FOLLOWERS","13,5 JT");
                profileIntent.putExtra("FOLLOWING","9");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar2);
                startActivity((profileIntent));
            } if(username.equals("dracomalfoy")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.malfoy);
                profileIntent.putExtra("NAMA PROFILE","Draco Malfoy");
                profileIntent.putExtra("FOLLOWERS","1,3 JT");
                profileIntent.putExtra("FOLLOWING","51");
                profileIntent.putExtra("POSTINGAN", R.drawable.gamabr3);
                startActivity((profileIntent));
            } if(username.equals("minervamcgonagall")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.minerva);
                profileIntent.putExtra("NAMA PROFILE","Prof. Minerva Mcgonagall");
                profileIntent.putExtra("FOLLOWERS","6,9 JT");
                profileIntent.putExtra("FOLLOWING","172");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar4);
                startActivity((profileIntent));
            }if(username.equals("prof.dumbledore")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.dumbledore);
                profileIntent.putExtra("NAMA PROFILE","Prof. Dumbledore");
                profileIntent.putExtra("FOLLOWERS","9,9 JT");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar5);
                startActivity((profileIntent));
            }if(username.equals("ms.granger")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.hermoni);
                profileIntent.putExtra("NAMA PROFILE","Hermonie Granger");
                profileIntent.putExtra("FOLLOWERS","17,6 JT");
                profileIntent.putExtra("FOLLOWING","18");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar6);
                startActivity((profileIntent));
            }if(username.equals("ronniegonnie")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.ron);
                profileIntent.putExtra("NAMA PROFILE","Ron Weasley");
                profileIntent.putExtra("FOLLOWERS","8,6 JT");
                profileIntent.putExtra("FOLLOWING","6");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar7);
                startActivity((profileIntent));
            } if(username.equals("nevlongbottom")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.neville);
                profileIntent.putExtra("NAMA PROFILE","Neville Longbottom");
                profileIntent.putExtra("FOLLOWERS","3,4 JT");
                profileIntent.putExtra("FOLLOWING","76");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar8);
                startActivity((profileIntent));
            }if(username.equals("siriusblack")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.sirius);
                profileIntent.putExtra("NAMA PROFILE","The Sirius Black");
                profileIntent.putExtra("FOLLOWERS","5,4 JT");
                profileIntent.putExtra("FOLLOWING","3");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar9);
                startActivity((profileIntent));
            } if(username.equals("prof.snape")){
                Intent profileIntent = new Intent(PostinganActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE",R.drawable.snape);
                profileIntent.putExtra("NAMA PROFILE","Professor Snape");
                profileIntent.putExtra("FOLLOWERS","2,4 JT");
                profileIntent.putExtra("FOLLOWING","1");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar10);
                startActivity((profileIntent));
            }
        });
    }

}
