package com.example.listapersonas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapersonas=new ArrayList<Personas>();
        listapersonas.add(new Personas("ana",'f'));
        listapersonas.add(new Personas("carlos",'m'));
        listapersonas.add(new Personas("fernanda",'f'));
        listapersonas.add(new Personas("gustavo",'m'));
        listapersonas.add(new Personas("jose",'m'));
        listapersonas.add(new Personas("Juan", 'm'));
        listapersonas.add(new Personas("karla",'f'));
        listapersonas.add(new Personas("luis",'m'));
        listapersonas.add(new Personas("maria",'f'));
        listapersonas.add(new Personas("marta",'f'));
        listapersonas.add(new Personas("pedro",'m'));
        listapersonas.add(new Personas("silvia",'f'));
        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }
    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;
        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);
            TextView textView1 = item.findViewById(R.id.tvNombre);
            textView1.setText(listapersonas.get(position).getNombre());
            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
}