package com.example.tema4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class AutoCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        // Elementos a sugerir
        String[] opciones = {"Opcion1", "Opcion2", "Opcion3", "Opcion4", "Opcion5", "Android", "Auto"};

        AutoCompleteTextView textoLeido = findViewById(R.id.miTexto);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opciones
        );

        textoLeido.setAdapter(adaptador);
    }
}