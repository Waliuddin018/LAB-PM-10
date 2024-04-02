package com.example.tugaspratikum3;

import static com.example.tugaspratikum3.DataSource.postingans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class activity_story extends AppCompatActivity {

    private ImageView profile_sg, story_sg;

    private TextView name_sg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        profile_sg = findViewById(R.id.picture_profile_sg);
        story_sg = findViewById(R.id.story_sg);
        name_sg = findViewById(R.id.name_sg);

        Intent intent = getIntent();

        int profilsg = intent.getIntExtra("foto_profil", 0);
        int storySg = intent.getIntExtra("story_sg", 0);
        String nameSg = intent.getStringExtra("name_sg");


        profile_sg.setImageResource(profilsg);
        story_sg.setImageResource(storySg);
        name_sg.setText(nameSg);

        name_sg.setOnClickListener(v -> {
            String name = name_sg.getText().toString();
            Intent intent3 = new Intent(activity_story.this, profile_activity.class);
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
    }
}