package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.foodapp.R;

public class Principal extends AppCompatActivity {

    TextView userMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        userMessage = findViewById(R.id.tvNombre);

        Bundle bundle  = getIntent().getExtras();

        String info = "Hola, " + bundle.getString("usuario");

        userMessage.setText(info);
    }
}