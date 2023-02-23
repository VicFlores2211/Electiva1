package com.example.parcial1_electiva1_2506062019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculateimc extends AppCompatActivity {

    EditText peso, altura;
    TextView results;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculateimc);

        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.etdAltura);
        results = findViewById(R.id.twResultImc);
    }

    public void Calculate(View view) {
        String message = "";
        double weight,height,result;

        weight =Double.parseDouble(peso.getText().toString());
        height =Double.parseDouble(altura.getText().toString());

        result = weight / (height * height);

        results.setText("");

        if (result < 10.5 ) {
            message = "Críticamente Bajo de Peso";
        } else if (result > 10.5 && result < 15.9) {
            message = "Severamente Bajo de Peso";
        } else if (result > 15.9 && result < 18.5) {
            message = "Bajo de Peso";
        } else if (result > 18.5 && result < 25) {
            message = "Normal (peso saludable";
        } else if (result > 25 && result < 30) {
            message = "Sobrepeso";
        } else if (result > 30 && result < 35) {
            message = "Obesidad Clase 1 - Moderadamente Obeso";
        } else if (result > 35 && result < 40) {
            message = "Obesidad Clase 2 - Severamente Obeso";
        } else if (result > 50) {
            message = "Obesidad Clase 3 - Críticamente Obeso";
        }

        results.setText(message);
    }
}