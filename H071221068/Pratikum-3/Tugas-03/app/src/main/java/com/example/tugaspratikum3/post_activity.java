package com.example.tugaspratikum3;

import static com.example.tugaspratikum3.DataSource.postingans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class post_activity extends AppCompatActivity {

    private ImageView ivprofil, ivpost;

    private TextView tvpost, tvdecs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        ivprofil = findViewById(R.id.profil);
        ivpost = findViewById(R.id.post);
        tvpost = findViewById(R.id.tv_name);
        tvdecs = findViewById(R.id.desc);

        Intent intent = getIntent();

        int profils = intent.getIntExtra("profil", 0);
        int posted  = intent.getIntExtra("post", 0);
        String nama = intent.getStringExtra("name");
        String deskripsi = intent.getStringExtra("description");

        ivprofil.setImageResource(profils);
        ivpost.setImageResource(posted);
        tvpost.setText(nama);
        tvdecs.setText(deskripsi);

        tvpost.setOnClickListener(v -> {
            String name = tvpost.getText().toString();
            Intent intent3 = new Intent(post_activity.this, profile_activity.class);
            intent3.putExtra("nama_profil", name);

            switch (name) {
                case "lifeatgojek":
                    intent3.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                    intent3.putExtra("followers", "11JT");
                    intent3.putExtra("following", "300K");
                    intent3.putExtra("postingan", R.drawable.lifeatgojekpost);
                    break;
                case "lifeatkalla":
                    intent3.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                    intent3.putExtra("followers", "15JT");
                    intent3.putExtra("following", "200K");
                    intent3.putExtra("postingan", R.drawable.lifeatkallapost);
                    break;
                case "lifeatfmcg":
                    intent3.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                    intent3.putExtra("followers", "5JT");
                    intent3.putExtra("following", "700K");
                    intent3.putExtra("postingan", R.drawable.lifeatfmcgpost);
                    break;
                case "lifeatruangguru":
                    intent3.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                    intent3.putExtra("followers", "5JT");
                    intent3.putExtra("following", "700K");
                    intent3.putExtra("postingan", R.drawable.lifeatrgpost);
                    break;
                case "lifeatshopee":
                    intent3.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                    intent3.putExtra("followers", "2JT");
                    intent3.putExtra("following", "700K");
                    intent3.putExtra("postingan", R.drawable.lifeatshoopepost);
                    break;
                case "Hasanuddin_Univ":
                    intent3.putExtra("foto_profil", R.drawable.unhasprofil);
                    intent3.putExtra("followers", "23JT");
                    intent3.putExtra("following", "700K");
                    intent3.putExtra("postingan", R.drawable.unhaspost);
                    break;
                case "uicyonsei":
                    intent3.putExtra("foto_profil", R.drawable.yonseiprofil);
                    intent3.putExtra("followers", "53JT");
                    intent3.putExtra("following", "500K");
                    intent3.putExtra("postingan", R.drawable.yonseipost);
                    break;
                case "harvard":
                    intent3.putExtra("foto_profil", R.drawable.harvardprofil);
                    intent3.putExtra("followers", "9JT");
                    intent3.putExtra("following", "570K");
                    intent3.putExtra("postingan", R.drawable.harvardpost);
                    break;
                case "univ_indonesia":
                    intent3.putExtra("foto_profil", R.drawable.uiprofil);
                    intent3.putExtra("followers", "10JT");
                    intent3.putExtra("following", "200K");
                    intent3.putExtra("postingan", R.drawable.uipost);
                    break;
                case "itb1920":
                    intent3.putExtra("foto_profil", R.drawable.itbprofil);
                    intent3.putExtra("followers", "10JT");
                    intent3.putExtra("following", "205K");
                    intent3.putExtra("postingan", R.drawable.itbpost);
                    break;

            }

            startActivity(intent3);
        });

        ivprofil.setOnClickListener(v -> {
            int profil = profils;
            Intent intent4 = new Intent(post_activity.this, activity_story.class);
            intent4.putExtra("profil_pic", profil);

                if (profil == R.drawable.lifeatgojekprofil) {
                    intent4.putExtra("foto_profil", R.drawable.lifeatgojekprofil);
                    intent4.putExtra("name_sg", "lifeatgojek");
                    intent4.putExtra("story_sg", R.drawable.lifeatgojekstory);
                } else if (profil == R.drawable.lifeatkallaprofil) {
                    intent4.putExtra("foto_profil", R.drawable.lifeatkallaprofil);
                    intent4.putExtra("name_sg", "lifeatkalla");
                    intent4.putExtra("story_sg", R.drawable.lifeatkallastory);
                } else if (profil == R.drawable.lifeatfmcgprofil) {
                    intent4.putExtra("foto_profil", R.drawable.lifeatfmcgprofil);
                    intent4.putExtra("name_sg", "lifeatfmcg");
                    intent4.putExtra("story_sg", R.drawable.lifeatfmcgstory);
                } else if (profil == R.drawable.lifeatrgprofil) {
                    intent4.putExtra("foto_profil", R.drawable.lifeatrgprofil);
                    intent4.putExtra("name_sg", "lifeatruangguru");
                    intent4.putExtra("story_sg", R.drawable.lifeatrgstory);
                } else if (profil == R.drawable.lifeatshoopeprofil) {
                    intent4.putExtra("foto_profil", R.drawable.lifeatshoopeprofil);
                    intent4.putExtra("name_sg", "lifeatshoope");
                    intent4.putExtra("story_sg", R.drawable.lifeatshoopestory);
                } else if (profil == R.drawable.unhasprofil) {
                    intent4.putExtra("foto_profil", R.drawable.unhasprofil);
                    intent4.putExtra("name_sg", "Hasanuddin_Univ");
                    intent4.putExtra("story_sg", R.drawable.unhasstory);
                } else if (profil == R.drawable.yonseiprofil) {
                    intent4.putExtra("foto_profil", R.drawable.yonseiprofil);
                    intent4.putExtra("name_sg", "uicyonsei");
                    intent4.putExtra("story_sg", R.drawable.yonseistory);
                } else if (profil == R.drawable.harvardprofil) {
                    intent4.putExtra("foto_profil", R.drawable.harvardprofil);
                    intent4.putExtra("name_sg", "harvard");
                    intent4.putExtra("story_sg", R.drawable.harvardstory);
                } else if (profil == R.drawable.uiprofil) {
                    intent4.putExtra("foto_profil", R.drawable.uiprofil);
                    intent4.putExtra("name_sg", "univ_indonesia");
                    intent4.putExtra("story_sg", R.drawable.uistory);
                } else if (profil == R.drawable.itbprofil) {
                    intent4.putExtra("foto_profil", R.drawable.itbprofil);
                    intent4.putExtra("name_sg", "itb1920");
                    intent4.putExtra("story_sg", R.drawable.itbstory);
                }

                startActivity(intent4);
            });

    }
}