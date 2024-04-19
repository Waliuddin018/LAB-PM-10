package com.example.tugaspratikum2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.net.Uri;


public class MainActivity3 extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewUsername;
    private TextView textviewnote1;
    private TextView textviewnote2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textViewName = findViewById(R.id.textViewName);
        textViewUsername = findViewById(R.id.textViewUsername);
        textviewnote1 = findViewById(R.id.note1);
        textviewnote2 = findViewById(R.id.note2);
        imageView = findViewById(R.id.imageView); // Inisialisasi ImageView

        Intent intent = getIntent();
        String name = intent.getStringExtra("text1");
        String username = intent.getStringExtra("text2");
        String note1 = intent.getStringExtra("field1");
        String note2 = intent.getStringExtra("field2");

        textViewName.setText("Name: " + name);
        textViewUsername.setText("Username: " + username);
        textviewnote1.setText("Field 1: " + note1);
        textviewnote2.setText("Field 2: " + note2);


        String imageUriString = intent.getStringExtra("gambargambar");
        if (imageUriString != null) {
            Uri imageUri = Uri.parse(imageUriString);
            imageView.setImageURI(imageUri);
        }
    }
}