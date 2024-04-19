package com.example.praktikum_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.praktikum_3.Datasources;
import com.example.praktikum_3.PostinganAdapter;
import com.example.praktikum_3.StoryAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPostingan = findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);//menetapkan posisinya

        PostinganAdapter postinganAdapter = new PostinganAdapter(Datasources.postingans,this);
        rvPostingan.setAdapter(postinganAdapter);//menghubungkan rv ke dataresouces

        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);
        rvStory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        StoryAdapter storyAdapter = new StoryAdapter(Datasources.stories, this);
        rvStory.setAdapter(storyAdapter);
    }

}