package com.example.tema4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Enlazar el Spinner del XML con Java
        Spinner miSpinner = findViewById(R.id.miSpinner);

        // 2. Datos que se mostrarán en la lista desplegable
        String[] valores = {"Star Wars", "Reservoir dogs", "El Club de la lucha", "Snatch: Cerdos y Diamantes"};

        // 3. Crear el adaptador para vincular los datos al Spinner
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                valores
        );
        // Opcional: estilo para la lista desplegada
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        miSpinner.setAdapter(adaptador);

        // 4. Listener para capturar el elemento seleccionado
        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String seleccionado = adapterView.getItemAtPosition(position).toString();
                System.out.println("Has seleccionado el valor: " + seleccionado);

                // Mensaje en pantalla tipo Toast para ver la selección
                Toast.makeText(MainActivity.this, "Seleccionado: " + seleccionado, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("No has seleccionado nada");
            }
        });
    }
}