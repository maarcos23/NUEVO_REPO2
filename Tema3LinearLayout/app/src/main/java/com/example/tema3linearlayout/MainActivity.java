package com.example.tema3linearlayout; // Conserva el nombre de tu paquete

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciamos la vista de texto
        texto = findViewById(R.id.texto);

        // Referenciamos los tres botones
        Button boton1 = findViewById(R.id.boton1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        // Registramos el listener en cada uno
        boton1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.boton1) {
            // Animación 1: Traslación
            Animation animTraslacion = AnimationUtils.loadAnimation(this, R.anim.anim_traslacion);
            texto.startAnimation(animTraslacion);

        } else if (id == R.id.button2) {
            // Animación 2: Rotación
            Animation animRotacion = AnimationUtils.loadAnimation(this, R.anim.anim_rotacion);
            texto.startAnimation(animRotacion);

        } else if (id == R.id.button3) {
            // Animación 3: Escalado
            Animation animEscalado = AnimationUtils.loadAnimation(this, R.anim.anim_escalado);
            texto.startAnimation(animEscalado);
        }
    }
}