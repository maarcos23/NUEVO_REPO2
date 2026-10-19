package com.example.tema4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        texto = findViewById(R.id.texto);
        Button boton1 = findViewById(R.id.button1);
        Button boton2 = findViewById(R.id.button2);
        Button boton3 = findViewById(R.id.button3);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.button1) {
            texto.setText("Se ha pulsado el boton 1");
        } else if (id == R.id.button2) {
            texto.setText("He presionado el boton 2");
        } else if (id == R.id.button3) {
            texto.setText("He presionado el boton 3");
        }
    }
}