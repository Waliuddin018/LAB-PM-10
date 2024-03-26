package com.example.tugaspratikum2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.net.Uri;
import android.net.Uri;

public class MainActivity2 extends AppCompatActivity {

    private EditText editTextView1;
    private EditText editTextView2;
    private TextView textview1;
    private TextView textview2;
    private ImageView imageview;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageview = findViewById(R.id.gambargambar);
        editTextView1 = findViewById(R.id.field1);
        editTextView2 = findViewById(R.id.field2);
        textview1 = findViewById(R.id.textViewName);
        textview2 = findViewById(R.id.textViewUsername);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String imageUriString = intent.getStringExtra("inigambar");
        imageUri = Uri.parse(imageUriString);

        textview1.setText(name);
        textview2.setText(username);
        imageview.setImageURI(imageUri);
    }

    public void activity3(View view) {
        String field01 = editTextView1.getText().toString();
        String field02 = editTextView2.getText().toString();
        String text1 = textview1.getText().toString();
        String text2 = textview2.getText().toString();

        Intent activity3 = new Intent(MainActivity2.this, MainActivity3.class);
        activity3.putExtra("field1", field01);
        activity3.putExtra("field2", field02);
        activity3.putExtra("text1", text1);
        activity3.putExtra("text2", text2);

        if (imageUri != null) {
            activity3.putExtra("gambargambar", imageUri.toString()); // Mengirim URI gambar ke Activity 3
        }

        startActivity(activity3);
    }
}