package com.example.tema4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        // Se usa la referencia completa para evitar conflicto con el nombre de tu clase
        android.widget.Spinner miSpinner = findViewById(R.id.miSpinner);

        String[] valores = {"Star Wars", "Reservoir dogs", "El Club de la lucha", "Snach: Cerdos y Diamantes"};

        miSpinner.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                valores
        ));

        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                System.out.println("Has seleccionado el valor:" + adapterView.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("No has seleccionado nada");
            }
        });
    }
}