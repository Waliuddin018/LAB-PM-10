package com.example.praktikum_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    ArrayList <String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextText); //mengambil kata yg dimasukkan pd edittext

        ListView listView = findViewById(R.id.listlist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                if (!text.isEmpty()) {
                    arrayList.add(text);
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                }
//                TextView newTextView = new TextView(MainActivity.this);
//                newTextView.setText(text);
//                newTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
//                newTextView.setTextColor(Color.BLACK);
//                newTextView.setBackgroundColor(Color.TRANSPARENT);
//
//                LinearLayout layout = findViewById(R.id.layoutlinear);
//                layout.addView(newTextView);
//
//                editText.setText("");
            }
        });
    }
}