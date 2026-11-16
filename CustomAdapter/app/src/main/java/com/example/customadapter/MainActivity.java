package com.example.customadapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView lista = findViewById(R.id.listview);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        ListView listado = null;
        listado.addHeaderView(miCabecera);

        Datos[] datos = new Datos[]{
         new Datos("España", "Madrid"),
         new Datos("Francia", "Paris"),
         new Datos("Italia", "Roma")
        };
        Adaptador adaptado = new Adaptador(this, datos);
        lista.setAdapter(adaptado);

        }
    }