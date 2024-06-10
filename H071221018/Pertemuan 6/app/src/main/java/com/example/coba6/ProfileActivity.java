package com.example.coba6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProfileActivity extends AppCompatActivity {
    private ImageView avatarImageView;
    private TextView nameTextView, emailTextView, connectionLost2;
    private ProgressBar progressBarProfile;
    private Button retryButton2;

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        avatarImageView = findViewById(R.id.iv_fotoProfile);
        nameTextView = findViewById(R.id.tv_Nama);
        emailTextView = findViewById(R.id.tv_Email);
        progressBarProfile = findViewById(R.id.progressBar3);
        retryButton2 = findViewById(R.id.retryButton2);
        connectionLost2 = findViewById(R.id.connectionLost2);

        User user = getIntent().getParcelableExtra("user");

        if (isNetworkAvailable()) {
            if (user != null) {
                progressBarProfile.setVisibility(View.VISIBLE);
                avatarImageView.setVisibility(View.GONE);
                nameTextView.setVisibility(View.GONE);
                emailTextView.setVisibility(View.GONE);

                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progressBarProfile.setVisibility(View.GONE);
                                Picasso.get().load(user.getAvatar()).into(avatarImageView);
                                nameTextView.setText(user.getFirst_name() + " " + user.getLast_name());
                                emailTextView.setText(user.getEmail());
                                avatarImageView.setVisibility(View.VISIBLE);
                                nameTextView.setVisibility(View.VISIBLE);
                                emailTextView.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                });
            } else {
                Toast.makeText(this, "User data is null", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
        if (!isNetworkAvailable()) {
            if (user != null) {
                retryButton2.setVisibility(View.VISIBLE);
                connectionLost2.setVisibility(View.VISIBLE);
                progressBarProfile.setVisibility(View.GONE);
                avatarImageView.setVisibility(View.GONE);
                emailTextView.setVisibility(View.GONE);
                nameTextView.setVisibility(View.GONE);

                retryButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isNetworkAvailable()) {
                            retryButton2.setVisibility(View.GONE);
                            connectionLost2.setVisibility(View.GONE);
                            progressBarProfile.setVisibility(View.VISIBLE);
                            ExecutorService executor = Executors.newSingleThreadExecutor();
                            executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            progressBarProfile.setVisibility(View.GONE);
                                            Picasso.get().load(user.getAvatar()).into(avatarImageView);
                                            nameTextView.setText(user.getFirst_name() + " " + user.getLast_name());
                                            emailTextView.setText(user.getEmail());
                                            avatarImageView.setVisibility(View.VISIBLE);
                                            nameTextView.setVisibility(View.VISIBLE);
                                            emailTextView.setVisibility(View.VISIBLE);
                                        }
                                    });
                                }
                            });
                        } else {
                            progressBarProfile.setVisibility(View.VISIBLE);
                            retryButton2.setVisibility(View.GONE);
                            connectionLost2.setVisibility(View.GONE);
                            ExecutorService executor = Executors.newSingleThreadExecutor();
                            executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Thread.sleep(300);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            progressBarProfile.setVisibility(View.GONE);
                                            retryButton2.setVisibility(View.VISIBLE);
                                            connectionLost2.setVisibility(View.VISIBLE);
                                        }
                                    });
                                }
                            });
                        }
                    }
                });
            }
        }
    }
}
