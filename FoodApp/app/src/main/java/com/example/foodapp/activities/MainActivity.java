package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.foodapp.R;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout btnIniciar;
    EditText edtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnInicio);
        edtUser = findViewById(R.id.edtName);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(new Intent(getApplicationContext(), Principal.class));
                i.putExtra("usuario", edtUser.getText().toString());
                startActivity(i);
            }
        });
    }
}