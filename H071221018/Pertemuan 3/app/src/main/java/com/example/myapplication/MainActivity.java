package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPosting = findViewById(R.id.rv_post);
        rvPosting.setHasFixedSize(true);

        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.instagrams);
        rvPosting.setAdapter(postinganAdapter);

        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.instagrams);
        rvStory.setAdapter(storyAdapter);
    }
}