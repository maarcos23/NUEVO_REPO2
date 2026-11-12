package com.example.tema5; // Pon aquí el nombre de tu paquete

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listViewPaises);
        TextView tvResultado = findViewById(R.id.tvPaisSeleccionado);

        String[] paises = {
                "España", "Francia", "Italia", "Alemania", "Portugal",
                "Países Bajos", "Bélgica", "Suiza", "Suecia", "Grecia"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                paises
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                String elemento = (String) parent.getItemAtPosition(posicion);
                tvResultado.setText(elemento);
            }
        });
    }
}