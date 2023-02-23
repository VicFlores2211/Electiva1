package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalla3 extends AppCompatActivity {

    Button btnMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        btnMensaje = findViewById(R.id.btnToast);

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toastP = new Toast(getApplicationContext());
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.lyMensaje));

                TextView txtMensaje = (TextView) layout.findViewById(R.id.txtMessage);
                txtMensaje.setText("Soy el mensaje");

                toastP.setDuration(Toast.LENGTH_LONG);
                toastP.setView(layout);
                toastP.show();
            }
        });
    }
}