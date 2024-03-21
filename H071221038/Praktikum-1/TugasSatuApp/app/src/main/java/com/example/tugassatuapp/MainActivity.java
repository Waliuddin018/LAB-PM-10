package com.example.tugassatuapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLain;
    private Button buttonOk;
    private ListView listView;

    private ArrayList<String> list_text;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLain = findViewById(R.id.editLain);
        buttonOk = findViewById(R.id.ok);
        listView = findViewById(R.id.listview);
        list_text = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list_text);
        listView.setAdapter(adapter);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextLain.getText().toString().trim();
                list_text.add(inputText);
                adapter.notifyDataSetChanged();
                editTextLain.setText("");
            }
        });
    }
}
