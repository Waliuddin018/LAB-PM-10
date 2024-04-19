package com.example.praktikum3;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_story;
    RecyclerView rv_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_story = findViewById(R.id.rv_story);
        AccountAdapter accountAdapter = new AccountAdapter(DataSource.accounts);
        rv_story.setAdapter(accountAdapter);

        accountAdapter.setClickListener(new AccountAdapter.ClickListener(){
            @Override
            public void onItemClicked(Account account) {
                Intent intent = new Intent(MainActivity.this,StoryActivity.class);
                intent.putExtra("kirim_story",account);
                startActivity(intent);
            }
        });



        rv_post = findViewById(R.id.rv_post);
        AccountAdapter2 accountAdapter2 = new AccountAdapter2(DataSource.accounts);
        rv_post.setAdapter(accountAdapter2);

        accountAdapter2.setClickListener(new AccountAdapter2.ClickListener() {
            @Override
            public void onItemClicked(Account account) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("kirim_profile",account);
                startActivity(intent);
            }
        });

    }
}