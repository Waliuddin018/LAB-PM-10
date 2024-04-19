package com.example.tugaspraktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.tugaspraktikum4.fragment.HomeFragment;

// Mengelola fragmen dan menampilkan fragmen HomeFragment di dalam activity

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Membuat object untuk mengelola fragmen dalam activity
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Membuat instance
        HomeFragment homeFragment = new HomeFragment();

        // Mencari/memeriksa fragmen menggunakan tag
        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, homeFragment)
                    .commit();
        }
    }
}