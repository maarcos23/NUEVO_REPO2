package com.example.tema4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        EditText etTexto = findViewById(R.id.texto);
        Button btnLeer = findViewById(R.id.btnLeer);

        btnLeer.setOnClickListener(v -> {
            String valorIngresado = etTexto.getText().toString();
            Toast.makeText(this, "Texto leído: " + valorIngresado, Toast.LENGTH_SHORT).show();
        });
    }
}