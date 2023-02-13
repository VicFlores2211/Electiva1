package com.example.controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValue, edtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValue = findViewById(R.id.edtTabla);
        edtResult = findViewById(R.id.edtCalculate);
    }

    public void Table(View view) {
        int value1 = Integer.parseInt(edtValue.getText().toString());
        String result = "";
        edtResult.setText(result);

        for(int i = 0; i <= 10; i++) {
            result = String.valueOf(value1*i);
            edtResult.append(value1+"*"+i+"="+result+"\n");
        }
    }
}