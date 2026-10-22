package com.example.tema3linearlayout; // Conserva el nombre de tu paquete

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // ========================================================
    // 2. PROBAR BUTTON (activity_button.xml)
    // ========================================================

        setContentView(R.layout.grid_layout);
        Button boton1 = findViewById(R.id.btn1);
        TextView textoBtn = findViewById(R.id.texto);
        btn1.setOnClickListener(v -> {
            textoBtn.setText("Se ha pulsado el botón");
            Toast.makeText(this, "Botón pulsado", Toast.LENGTH_SHORT).show();
        });

}