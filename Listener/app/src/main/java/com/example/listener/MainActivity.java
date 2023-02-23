package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {

    Button mainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.btnListener);

        // Listener
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(getApplicationContext(), Pantalla2.class);
                startActivity(intento);
            }
        });
    }

    // Metodo
    public void Pantalla(View view) {
        Intent intento = new Intent(this, Pantalla3.class);
        startActivity(intento);
    }

    public void Salir(View view) {
        finish();
    }
}