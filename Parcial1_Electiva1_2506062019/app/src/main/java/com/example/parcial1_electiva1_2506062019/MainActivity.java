package com.example.parcial1_electiva1_2506062019;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button mainButton;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        result = findViewById(R.id.twResult);

        mainButton = findViewById(R.id.btnLogin);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String key = password.getText().toString();

                if (user.equals("parcialETps1") && key.equals("p4rC14l#tp$")) {
                    Intent intento = new Intent(getApplicationContext(), Calculateimc.class);
                    startActivity(intento);
                } else {
                    result.setText("Contraseña y usuario no son correctos");
                }

            }
        });
    }
}