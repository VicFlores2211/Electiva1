package com.example.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value1, value2, symbol;
    TextView getResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value2 = findViewById(R.id.edtValue2);
        value1 = findViewById(R.id.edtValue1);
        symbol = findViewById(R.id.edtSymbol);

        getResult = findViewById(R.id.twResult);
    }

    public void Calculate(View view) {

        double data1, data2, result;

        data1 = Double.parseDouble(value1.getText().toString());
        data2 = Double.parseDouble(value2.getText().toString());

        if (symbol.getText().toString().equals("+")) {
            result = data1 + data2;
            getResult.setText(String.valueOf(result));
        } else if (symbol.getText().toString().equals("-")) {
            result = data1 - data2;
            getResult.setText(String.valueOf(result));
        } else if (symbol.getText().toString().equals("*")) {
            result = data1 * data2;
            getResult.setText(String.valueOf(result));
        } else if (symbol.getText().toString().equals("/")) {
            result = data1 / data2;
            getResult.setText(String.valueOf(result));
        } else {
            getResult.setText(String.valueOf("Invalid Symbol"));
        }
    }
}