package com.example.calculateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextValue1, editTextValue2;
    Button buttonResult;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue1 = findViewById(R.id.value1);
        editTextValue2 = findViewById(R.id.value2);

        textViewResult = findViewById(R.id.txtViewResult);

    }

    public void Sum(View view) {
        double data1, data2, result;

        data1 = Double.parseDouble(editTextValue1.getText().toString());
        data2 = Double.parseDouble(editTextValue2.getText().toString());

        result = data1 + data2;

        textViewResult.setText(String.valueOf(result));
    }
}