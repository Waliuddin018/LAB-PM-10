package com.example.praktikum_3;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView ivProfile = findViewById(R.id.iv_profile2);
        TextView tvProfile = findViewById(R.id.tv_profile2);
        ImageView imageStory = findViewById(R.id.imageStory);

        Intent intent = getIntent();

        int fotoProfile = intent.getIntExtra("FOTO PROFILE", 0);
        String namaProfile = intent.getStringExtra("NAMA PROFILE");
        int fotoStory = intent.getIntExtra("STORY", 0);

        ivProfile.setImageResource(fotoProfile);
        tvProfile.setText(namaProfile);
        imageStory.setImageResource(fotoStory);

        tvProfile.setOnClickListener(v -> {
            if (namaProfile.equals("voldemort678")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.voldemort);
                profileIntent.putExtra("NAMA PROFILE", "Lord Voldemort");
                profileIntent.putExtra("FOLLOWERS", "1,5 JT");
                profileIntent.putExtra("FOLLOWING", "2");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar1);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("harrypotter")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.harry);
                profileIntent.putExtra("NAMA PROFILE", "Harry Potter");
                profileIntent.putExtra("FOLLOWERS", "13,5 JT");
                profileIntent.putExtra("FOLLOWING", "9");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar2);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("dracomalfoy")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.malfoy);
                profileIntent.putExtra("NAMA PROFILE", "Draco Malfoy");
                profileIntent.putExtra("FOLLOWERS", "1,3 JT");
                profileIntent.putExtra("FOLLOWING", "51");
                profileIntent.putExtra("POSTINGAN", R.drawable.gamabr3);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("minervamcgonagall")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.minerva);
                profileIntent.putExtra("NAMA PROFILE", "Prof. Minerva Mcgonagall");
                profileIntent.putExtra("FOLLOWERS", "6,9 JT");
                profileIntent.putExtra("FOLLOWING", "172");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar4);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("prof.dumbledore")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.dumbledore);
                profileIntent.putExtra("NAMA PROFILE", "Prof. Dumbledore");
                profileIntent.putExtra("FOLLOWERS", "9,9 JT");
                profileIntent.putExtra("FOLLOWING", "1");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar5);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("ms.granger")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.hermoni);
                profileIntent.putExtra("NAMA PROFILE", "Hermonie Granger");
                profileIntent.putExtra("FOLLOWERS", "17,6 JT");
                profileIntent.putExtra("FOLLOWING", "18");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar6);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("ronniegonnie")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.ron);
                profileIntent.putExtra("NAMA PROFILE", "Ron Weasley");
                profileIntent.putExtra("FOLLOWERS", "8,6 JT");
                profileIntent.putExtra("FOLLOWING", "6");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar7);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("nevlongbottom")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.neville);
                profileIntent.putExtra("NAMA PROFILE", "Neville Longbottom");
                profileIntent.putExtra("FOLLOWERS", "3,4 JT");
                profileIntent.putExtra("FOLLOWING", "76");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar8);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("siriusblack")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.sirius);
                profileIntent.putExtra("NAMA PROFILE", "The Sirius Black");
                profileIntent.putExtra("FOLLOWERS", "5,4 JT");
                profileIntent.putExtra("FOLLOWING", "3");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar9);
                startActivity((profileIntent));
            }
            if (namaProfile.equals("prof.snape")) {
                Intent profileIntent = new Intent(StoryActivity.this, ProfileActivity.class);
                profileIntent.putExtra("FOTO PROFILE", R.drawable.snape);
                profileIntent.putExtra("NAMA PROFILE", "Professor Snape");
                profileIntent.putExtra("FOLLOWERS", "2,4 JT");
                profileIntent.putExtra("FOLLOWING", "1");
                profileIntent.putExtra("POSTINGAN", R.drawable.gambar10);
                startActivity((profileIntent));
            }
            ;
        });
    }
}