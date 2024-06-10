package com.example.tugasprak4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FragmentManager fragmentManager = getSupportFragmentManager();
    private ImageView homeIconMenuIv;
    private TextView homeTextMenuTv;
    private LinearLayout homeLayout;
    private LinearLayout postingLayout;
    private LinearLayout profileLayout;
    private ImageView postIconMenuIv;
    private TextView postTextMenuTv;
    private ImageView profileIconMenuIv;
    private TextView profileTextMenuTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi elemen tampilan
        initView();

        HomeFragment homeFragment = new HomeFragment();

        //dicek apakah HomeFragment blm ada di FragmentManager, supaya cegah duplikasi
        if (!(fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName()) instanceof HomeFragment)) {

            //jika blm ada, fragment dimulai
            fragmentManager.beginTransaction().replace(R.id.frame_layout, homeFragment, HomeFragment.class.getSimpleName()).commit();
        }

        homeLayout.setOnClickListener(this);
        postingLayout.setOnClickListener(this);
        profileLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickMenu(v);
    }

    //method utk atur tampilan menu home bdk status aktif atau tdk
    public void isActiveHomeMenu(boolean isActive) {
        //kalau aktif, icon nya berwarna
        if (isActive) {
            homeIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.primaryColor));
            homeTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.primaryColor));
        } else {
            homeIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.dividerColor));
            homeTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.dividerColor));
        }
    }

    public void isActivePostMenu(boolean isActive) {
        if (isActive) {
            postIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.primaryColor));
            postTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.primaryColor));
        } else {
            postIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.dividerColor));
            postTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.dividerColor));
        }
    }

    public void isActiveProfileMenu(boolean isActive) {
        if (isActive) {
            profileIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.primaryColor));
            profileTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.primaryColor));
        } else {
            profileIconMenuIv.setColorFilter(ContextCompat.getColor(this, R.color.dividerColor));
            profileTextMenuTv.setTextColor(ContextCompat.getColor(this, R.color.dividerColor));
        }
    }


    //method utk menangani klik pada menu
    private void onClickMenu(View view) {

        //fragment kosong yg nnti di inisialisasi sesuai tmpilan yang di klik
        Fragment selectedFragment = new Fragment();

        // string kosong yg simpan nama fragment
        String fragmentName = "";

        if (view == homeLayout) {
            selectedFragment = new HomeFragment();
            fragmentName = HomeFragment.class.getSimpleName();
            isActiveHomeMenu(true);
            isActivePostMenu(false);
            isActiveProfileMenu(false);
        } else if (view == postingLayout) {
            selectedFragment = new PostFragment();
            fragmentName = PostFragment.class.getSimpleName();
            isActiveHomeMenu(false);
            isActivePostMenu(true);
            isActiveProfileMenu(false);
        } else if (view == profileLayout) {
            selectedFragment = new ProfileFragment();
            fragmentName = ProfileFragment.class.getSimpleName();
            isActiveHomeMenu(false);
            isActivePostMenu(false);
            isActiveProfileMenu(true);
        }

        //periksa apakah fragment sdh ada dalam frgmntMnajer
        if (fragmentManager.findFragmentByTag(fragmentName) == null) {

            //klo blm ada fragment baru dimulai
            fragmentManager.beginTransaction().replace(R.id.frame_layout, selectedFragment, fragmentName).commit();
        }
    }

    //inisialisasi elemen tampilan
    private void initView() {
        homeIconMenuIv = findViewById(R.id.home_icon);
        homeTextMenuTv = findViewById(R.id.home_text);
        postIconMenuIv = findViewById(R.id.posting_icon);
        postTextMenuTv = findViewById(R.id.posting_text);
        profileIconMenuIv = findViewById(R.id.profile_icon);
        profileTextMenuTv = findViewById(R.id.profile_text);
        homeLayout = findViewById(R.id.home_layout);
        postingLayout = findViewById(R.id.posting_layout);
        profileLayout = findViewById(R.id.profile_layout);

//        isActiveHomeMenu(true);
//        isActivePostMenu(false);
//        isActiveProfileMenu(false);
    }
}
