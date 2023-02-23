package com.example.controls_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnPais;
    EditText etNombre, etLastname, etInfo;
    RadioButton rbMasculino, rbFemenino, rbOtro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Edit Text
        etNombre = findViewById(R.id.etdName);
        etLastname = findViewById(R.id.etdLastname);
        etInfo = findViewById(R.id.tmlResult);

        // Spinner
        spnPais = findViewById(R.id.spnPais);

        // Radio Button
        rbFemenino = findViewById(R.id.rbFemenino);
        rbMasculino = findViewById(R.id.rbMasculino);
        rbOtro = findViewById(R.id.rbOtros);


        /* Lista Paises forma 1 */

        /* String[]opciones={"Seleccione un pais","Guatemala", "El Salvador", "Honduras", "Panama"};

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, opciones);

        spnPais.setAdapter(adaptador); */

        /* Lista paises forma 2 */

        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item){
                    public View getView(int position, View contenido, ViewGroup parent) {
                        View vista = super.getView(position, contenido, parent);

                        if (position == getCount()) {
                            ((TextView)vista.findViewById(android.R.id.text1)).setText("");
                            ((TextView)vista.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                        }

                        return vista;
                    };

                    public int getCount() {
                        return super.getCount() - 1;
                    }
                };

        adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adaptador2.add("Guatemala");
        adaptador2.add("El Salvador");
        adaptador2.add("Honduras");
        adaptador2.add("Panama");
        adaptador2.add("Seleccione un pais");

        spnPais.setAdapter(adaptador2);
        spnPais.setSelection(adaptador2.getCount());

    }

    public void Almacenar(View view) {

        String datos = "";
        String nombre= etNombre.getText().toString();
        String lastname= etLastname.getText().toString();
        String genero = "";
        String select = spnPais.getSelectedItem().toString();
        String info = "";

        etInfo.setText("");

        // Radio Button

        if (!rbMasculino.isChecked() && !rbFemenino.isChecked() && !rbOtro.isChecked()) {
            genero = "Genero es requerid";
        }

        if (rbMasculino.isChecked()) {
            genero = "Masculino";
        } else if (rbFemenino.isChecked()) {
            genero = "Femenino";
        } else if (rbOtro.isChecked()) {
            genero = "Otro";
        }


        // Spinner

        if (select.equals("Guatemala")) {
            datos = "Guatemala";
        } else if (select.equals("El Salvador")) {
            datos = "El Salvador";
        } else if (select.equals("Honduras")) {
            datos = "Honduras";
        } else if (select.equals("Panama")) {
            datos = "Panama";
        } else {
            datos = "Ningun pais seleccionado";
        }

        info = "Los datos ingresados son los siguientes\n" +
                "Nombre: " + nombre+"\n"+
                "Apellido: " + lastname+"\n"+
                "Genero: " + genero+"\n"+
                "Pais: " + datos+"\n";

        etInfo.append(info);
    }
}