package com.example.tugaspratikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView stories, postingan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stories = findViewById(R.id.stories);
        postingan = findViewById(R.id.postingan);


        stories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        postingan.setLayoutManager(new GridLayoutManager(this,1));

        stories.setHasFixedSize(true);
        postingan.setHasFixedSize(true);


        PostinganAdapter postinganadapter = new PostinganAdapter(this,DataSource.postingans);
        StoryAdapter storyAdapter = new StoryAdapter(this, DataSource.storys);
        postingan.setAdapter(postinganadapter);
        stories.setAdapter(storyAdapter);

    }

}