package com.example.tema4; // Tu nombre de paquete

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* ========================================================
         * 1. TEXTVIEW (Cambios en tiempo de ejecución)
         * ======================================================== */
        /*
        TextView miTexto = findViewById(R.id.texto);
        miTexto.setText("Nuevo texto desde Java");
        miTexto.setTextColor(Color.parseColor("#0000FF"));
        miTexto.setTypeface(null, Typeface.ITALIC);
        miTexto.setTextSize(24);
        */

        /* ========================================================
         * 2. BUTTON (Eventos de clic)
         * ======================================================== */

        Button boton1 = findViewById(R.id.boton1);
        boton1.setOnClickListener(v -> {
            Toast.makeText(this, "Se ha pulsado el botón", Toast.LENGTH_SHORT).show();
        });


        /* ========================================================
         * 3. TOGGLEBUTTON (Estado encendido / apagado)
         * ======================================================== */
        /*
        ToggleButton miToggle = findViewById(R.id.miToggleButton);
        miToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Estado: Pulsado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Estado: No Pulsado", Toast.LENGTH_SHORT).show();
            }
        });
        */

        /* ========================================================
         * 4. IMAGEBUTTON (Clic en imagen)
         * ======================================================== */
        /*
        ImageButton miImageButton = findViewById(R.id.miImageButton);
        miImageButton.setOnClickListener(v -> {
            Toast.makeText(this, "Pulsado botón con imagen", Toast.LENGTH_SHORT).show();
        });
        */

        /* ========================================================
         * 5. EDITTEXT (Leer el texto introducido)
         * ======================================================== */
        /*
        EditText textoEmail = findViewById(R.id.texto_email);
        // Para leer el texto cuando lo necesites:
        // String email = textoEmail.getText().toString();
        */

        /* ========================================================
         * 6. AUTOCOMPLETETEXTVIEW (Autocompletar una palabra)
         * ======================================================== */
        /*
        AutoCompleteTextView miTextoAuto = findViewById(R.id.miTextoAuto);
        String[] opciones = {"Opcion1", "Opcion2", "Opcion3", "Opcion4", "Android", "Auto"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opciones
        );
        miTextoAuto.setAdapter(adaptador);
        */

        /* ========================================================
         * 7. MULTIAUTOCOMPLETETEXTVIEW (Autocompletar múltiples palabras)
         * Nota: Requiere setTokenizer para saber qué separa cada elemento
         * ======================================================== */
        /*
        MultiAutoCompleteTextView miMultiAuto = findViewById(R.id.miMultiAuto);
        String[] opcionesMulti = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "Bilbao"};
        ArrayAdapter<String> adaptadorMulti = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opcionesMulti
        );
        miMultiAuto.setAdapter(adaptadorMulti);
        // Indispensable: el Tokenizer separa sugerencias tras una coma (",")
        miMultiAuto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        */
    }
}