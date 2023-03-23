package com.example.ejerciciovicu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText triangulo1, triangulo2, triangulo3;
    ImageView imgTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triangulo1 = findViewById(R.id.edtTriangulo);
        triangulo2 = findViewById(R.id.edtTriangulo2);
        triangulo3 = findViewById(R.id.edtTriangulo3);

        imgTriangulo = findViewById(R.id.iwTriangulo);
    }

    public void Calculate(View view) {

        double tria1, tria2, tria3;

        tria1 = Double.parseDouble(triangulo1.getText().toString());
        tria2 = Double.parseDouble(triangulo2.getText().toString());
        tria3 = Double.parseDouble(triangulo3.getText().toString());

        if ( tria1 == tria2 && tria2 == tria3 ) {
            imgTriangulo.setImageResource(R.drawable.triangulo_eqilatero);
        } else if ( tria1 == tria2 || tria2 == tria3 || tria1 == tria3 ) {
            imgTriangulo.setImageResource(R.drawable.triangulo_isoseles);
        } else {
            imgTriangulo.setImageResource(R.drawable.triangulo_escaleno);
        }
    }
}