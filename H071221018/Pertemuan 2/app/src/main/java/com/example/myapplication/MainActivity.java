package com.example.myapplication;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Uri image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.gambar);
        EditText editText = findViewById(R.id.nama);
        EditText editText2 = findViewById(R.id.username);
        Button buttonSubmit = findViewById(R.id.btn_nama);

        ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        image = data.getData();
                        imageView.setImageURI(image);
                    }
                }
        );

        imageView.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");

            Intent openFile = new Intent(Intent.ACTION_GET_CONTENT);
            openFile.setType("image/*");

            Intent chooserIntent = Intent.createChooser(openGallery, "Pilih Gambar");
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[]{openFile});
            launcherIntentGallery.launch(chooserIntent);
        });

        buttonSubmit.setOnClickListener(view -> {
            String name = editText.getText().toString();
            String username = editText2.getText().toString();

            if (image == null) {
                Toast.makeText(MainActivity.this, "Harap isi gambar", Toast.LENGTH_SHORT).show();
            } else if (name.isEmpty()) {
                editText.setError("Harap isi nama");
            } else if (username.isEmpty()) {
                editText2.setError("Harap isi username");
            } else {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("username", username);
                intent.putExtra("image", image.toString());
                startActivity(intent);
            }
        });
    }
}
