package com.example.tugaspraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> dataList; // mendeklarasikan arraylist untuk menyimpan data input
    private ArrayAdapter<String> adapter; // menghubungkan DataList ke ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // memanggil method
        setContentView(R.layout.activity_main); // Mengatur tata letak activity

        EditText inputText = findViewById(R.id.lainnya);
        Button buttonEdit = findViewById(R.id.buttonedit);
        ListView listView = findViewById(R.id.listitem); // Mendeklarasikan dan menginisialisasi

        dataList = new ArrayList<>(); // menyimpan data inputan
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList); //  menghubungkan data dari dataList ke ListView
        listView.setAdapter(adapter); // menetapkan adapter

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = inputText.getText().toString().trim();
                if (!newText.isEmpty()) {           // Ketika tombol diklik, teksnya yang dimasukkan
                    dataList.add(newText);          // oleh pengguna diambil dari EditText, ditambahkan
                    adapter.notifyDataSetChanged(); // ke dataList, adapter diberitahu tentang perubahan,
                    inputText.getText().clear();    // dan EditText dikosongkan.
                }
            }
        });
    }
}