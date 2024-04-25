package com.example.tugasprak4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ProfileActivity extends AppCompatActivity {
    private ImageView iv_profile;
    private TextView nama, username;
    private ProgressBar pb_profile;
    Executor executor = Executors.newSingleThreadExecutor();
    Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        iv_profile = findViewById(R.id.iv_profile2);
        nama = findViewById(R.id.tv_nama2);
        username = findViewById(R.id.tv_username2);
        pb_profile = findViewById(R.id.pb_profile);

        Intent intent = getIntent();
        Post post =intent.getParcelableExtra("post");

        iv_profile.setImageResource(post.getProfile());
        nama.setText(post.getNama());
        username.setText(post.getUsername());

        // Menggunakan executor untuk menjalankan tugas dengan jeda waktu
        executor.execute(() -> {
            // Mengatur progress bar menjadi terlihat
            handler.post(() -> pb_profile.setVisibility(ProgressBar.VISIBLE));

            try {
                // Menunggu selama 3 detik (3000 milidetik)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Setelah jeda waktu 3 detik, mengatur progress bar menjadi tidak terlihat
            handler.post(() -> {
                pb_profile.setVisibility(ProgressBar.GONE);
                iv_profile.setVisibility(ImageView.VISIBLE);
                nama.setVisibility(TextView.VISIBLE);
                username.setVisibility(TextView.VISIBLE);
            });

        });
    }
}