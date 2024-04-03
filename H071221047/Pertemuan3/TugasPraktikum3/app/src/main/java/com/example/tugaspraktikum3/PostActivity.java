package com.example.tugaspraktikum3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostActivity extends AppCompatActivity {

    private ImageView iv_profile;
    private ImageView iv_feed;
    private TextView tv_nama;
    private TextView tv_caption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);

        Intent intent = getIntent();

        // Mengambil data yang dikirim dari StoryActivity
        String nama = intent.getStringExtra("nama");
        String caption = intent.getStringExtra("caption");
        int imageProfile = intent.getIntExtra("imageprofile", 0);
        int imageStory = intent.getIntExtra("imagestory", 0);
        int imageFeed = intent.getIntExtra("imagefeed", 0);
        int followers = intent.getIntExtra("followers", 0);
        int following = intent.getIntExtra("following", 0);

        // Inisialisasi views
        iv_profile = findViewById(R.id.iv_profile4);
        iv_feed = findViewById(R.id.iv_feed3);
        tv_nama = findViewById(R.id.tv_namaprofile);
        tv_caption = findViewById(R.id.tv_caption2);

        // Menampilkan data instagram pada views
        iv_profile.setImageResource(imageProfile);
        iv_feed.setImageResource(imageFeed);
        tv_nama.setText(nama);
        tv_caption.setText(caption);

        tv_nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
                intent.putExtra("nama", nama);
                intent.putExtra("imageprofile", imageProfile);
                intent.putExtra("imagefeed", imageFeed);
                intent.putExtra("imagestory", imageStory);
                intent.putExtra("followers", followers);
                intent.putExtra("following", following);
                intent.putExtra("caption", caption);
                startActivity(intent);
            }
        });


        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, StoryActivity.class);
                intent.putExtra("nama", nama);
                intent.putExtra("imageprofile", imageProfile);
                intent.putExtra("imagefeed", imageFeed);
                intent.putExtra("imagestory", imageStory);
                intent.putExtra("followers", followers);
                intent.putExtra("following", following);
                intent.putExtra("caption", caption);
                startActivity(intent);
            }
        });
    }
}
