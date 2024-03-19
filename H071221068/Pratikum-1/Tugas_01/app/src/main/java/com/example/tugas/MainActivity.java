package com.example.tugas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupGender;
    private RadioButton lastCheckedRadioButton;
    private EditText inputText;
    private Button btnOk;
    private TextView displayText, displayText1, displayText2, displayText3, displayText4, displayText5;
    private int inputCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupGender = findViewById(R.id.radioGroupGender);
        inputText = findViewById(R.id.inputText);
        btnOk = findViewById(R.id.btnOk);
        displayText = findViewById(R.id.displayText);
        displayText1 = findViewById(R.id.displayText1);
        displayText2 = findViewById(R.id.displayText2);
        displayText3 = findViewById(R.id.displayText3);
        displayText4 = findViewById(R.id.displayText4);
        displayText5 = findViewById(R.id.displayText5);

        for (int i = 0; i < radioGroupGender.getChildCount(); i++) {
            RadioButton radioButton = (RadioButton) radioGroupGender.getChildAt(i);
            radioButton.setOnClickListener(radioButtonClickListener);
        }

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();

                if (!input.isEmpty()) {
                    inputCounter++;
                    switch (inputCounter) {
                        case 1:
                            displayText1.setText(input);
                            break;
                        case 2:
                            displayText2.setText(input);
                            break;
                        case 3:
                            displayText3.setText(input);
                            break;
                        case 4:
                            displayText4.setText(input);
                            break;
                        case 5:
                            displayText5.setText(input);
                            break;
                        default:
                            showToast("Input sudah mencapai maksimal");
                            break;
                    }

                    inputText.setText("");
                }
            }
        });
    }

    private View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton clickedRadioButton = (RadioButton) v;
            if (clickedRadioButton == lastCheckedRadioButton) {
                radioGroupGender.clearCheck();
                lastCheckedRadioButton = null;
                showToast("Semua pilihan direset");
            } else {
                lastCheckedRadioButton = clickedRadioButton;
                showToast("Anda memilih jenis kelamin " + clickedRadioButton.getText().toString());
            }
        }
    };

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
