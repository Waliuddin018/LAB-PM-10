package com.example.pertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pertemuan4.fragment.HomeFragment;
import com.example.pertemuan4.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();

        ProfileFragment homeFragment = new ProfileFragment();
        Fragment fragment = fragmentManager.findFragmentByTag(ProfileFragment.class.getSimpleName());
        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, homeFragment)
                    .commit();
        }

    }
}