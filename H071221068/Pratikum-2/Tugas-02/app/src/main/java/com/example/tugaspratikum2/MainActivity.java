package com.example.tugaspratikum2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText editTextName;
    private EditText editTextUsername;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.gambarfoto);
        editTextName = findViewById(R.id.nama);
        editTextUsername = findViewById(R.id.username);
    }

    public void activity2(View view) {

        String name = editTextName.getText().toString();
        String username = editTextUsername.getText().toString();


        Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);
        activity2.putExtra("name", name);
        activity2.putExtra("username", username);

        if (imageUri != null) {
            activity2.putExtra("inigambar", imageUri.toString());
        }

        startActivity(activity2);
    }

    public void gambar(View view) {

        Intent gambar = new Intent(Intent.ACTION_PICK);
        gambar.setType("image/*");
        launcherIntentGallery.launch(gambar);
    }


    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent data = result.getData();
                    if (data != null) {
                        imageUri = data.getData();
                        imageView.setImageURI(imageUri);
                    }
                }
            }
    );
}