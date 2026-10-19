package com.example.tema4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class MultiAutoCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete);

        String[] opciones = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "Bilbao", "Malaga"};

        MultiAutoCompleteTextView multiTexto = findViewById(R.id.miMultiTexto);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opciones
        );

        multiTexto.setAdapter(adaptador);

        // Elemento clave para MultiAutoCompleteTextView: separa los términos por coma
        multiTexto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}