package com.example.tugasprak1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;





public class MainActivity extends AppCompatActivity {

    EditText masukkanHalLain;
    Button button;


    ListView simpleList;
    ArrayList<String> dataList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukkanHalLain = findViewById(R.id.masukkanHalLain);
        button = findViewById(R.id.button);
        simpleList = findViewById(R.id.hasilInputan);

        dataList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);


        simpleList.setAdapter(adapter);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputan = masukkanHalLain.getText().toString().trim();
                if (!inputan.isEmpty()) {

                    dataList.add(inputan);
                    adapter.notifyDataSetChanged();
                    masukkanHalLain.getText().clear();


                }
            }
        });

    }

}