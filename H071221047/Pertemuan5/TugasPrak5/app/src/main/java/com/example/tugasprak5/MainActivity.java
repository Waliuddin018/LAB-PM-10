package com.example.tugasprak4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
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
    private ImageView searchIconMenuIv;
    private TextView searchIconMenuTv;
    private LinearLayout searchLayout;

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
        searchLayout.setOnClickListener(this);
        postingLayout.setOnClickListener(this);
        profileLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickMenu(v);
    }

    //method utk menangani klik pada menu
    private void onClickMenu(View view) {
        Fragment selectedFragment = new Fragment();
        String fragmentName = "";

        if (view == homeLayout) {
            selectedFragment = new HomeFragment();
            fragmentName = HomeFragment.class.getSimpleName();
            setActiveMenu(homeIconMenuIv, homeTextMenuTv, true);
            setActiveMenu(postIconMenuIv, postTextMenuTv, false);
            setActiveMenu(profileIconMenuIv, profileTextMenuTv, false);
            setActiveMenu(searchIconMenuIv, searchIconMenuTv, false);
        } else if (view == searchLayout) {
            selectedFragment = new SearchFragment();
            fragmentName = SearchFragment.class.getSimpleName();
            setActiveMenu(homeIconMenuIv, homeTextMenuTv, false);
            setActiveMenu(postIconMenuIv, postTextMenuTv, false);
            setActiveMenu(profileIconMenuIv, profileTextMenuTv, false);
            setActiveMenu(searchIconMenuIv, searchIconMenuTv, true);
        } else if (view == postingLayout) {
            selectedFragment = new PostFragment();
            fragmentName = PostFragment.class.getSimpleName();
            // Anda dapat menyesuaikan aktivasi menu sesuai kebutuhan
        } else if (view == profileLayout) {
            selectedFragment = new ProfileFragment();
            fragmentName = ProfileFragment.class.getSimpleName();
            // Anda dapat menyesuaikan aktivasi menu sesuai kebutuhan
        }

        if (fragmentManager.findFragmentByTag(fragmentName) == null) {
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
        searchLayout = findViewById(R.id.search_layout);
        searchIconMenuIv = findViewById(R.id.search_icon);
        searchIconMenuTv = findViewById(R.id.search_text);
    }

    public void setActiveMenu(ImageView iconImageView, TextView textTextView, boolean isActive) {
        // Kode untuk mengatur tampilan ikon
        // Anda dapat menyesuaikan kode ini sesuai dengan kebutuhan tampilan ikon
    }
}
