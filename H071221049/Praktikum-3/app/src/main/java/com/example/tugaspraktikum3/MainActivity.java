package com.example.tugaspraktikum3;

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

        PostingAdapter postinganAdapter = new PostingAdapter(DataSource.postings, this);
        rvPosting.setAdapter(postinganAdapter);

        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.stories, this);
        rvStory.setAdapter(storyAdapter);
    }

}