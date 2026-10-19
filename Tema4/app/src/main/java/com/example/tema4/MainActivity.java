package com.example.tema4;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ========================================================
        // 1. PROBAR TEXTVIEW (activity_text_view.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_text_view);
        TextView miTexto = findViewById(R.id.texto);
        miTexto.setText("Nuevo texto a mostrar");
        miTexto.setTextColor(Color.parseColor("#0000FF"));
        miTexto.setTextColor(Color.RED);
        miTexto.setTypeface(null, Typeface.ITALIC);
        miTexto.setTextSize(24);
        miTexto.setTypeface(Typeface.SANS_SERIF);
        */

        // ========================================================
        // 2. PROBAR BUTTON (activity_button.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_button);
        Button boton1 = findViewById(R.id.boton1);
        TextView textoBtn = findViewById(R.id.texto);
        boton1.setOnClickListener(v -> {
            textoBtn.setText("Se ha pulsado el botón");
            Toast.makeText(this, "Botón pulsado", Toast.LENGTH_SHORT).show();
        });
        */

        // ========================================================
        // 3. PROBAR TOGGLEBUTTON (activity_toggle_button.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_toggle_button);
        ToggleButton miToggle = findViewById(R.id.miToggleButton);
        miToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "No Pulsado", Toast.LENGTH_SHORT).show();
            }
        });
        */

        // ========================================================
        // 4. PROBAR EDITTEXT (activity_edit_text.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_edit_text);
        EditText textoEmail = findViewById(R.id.texto_email);
        */

        // ========================================================
        // 5. PROBAR AUTOCOMPLETETEXTVIEW (activity_auto_complete.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_auto_complete);
        String[] opciones = {"Opcion1", "Opcion2", "Opcion3", "Opcion4", "Opcion5", "Android", "Auto"};
        AutoCompleteTextView autoTexto = findViewById(R.id.miTexto);
        ArrayAdapter<String> adaptadorAuto = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opciones
        );
        autoTexto.setAdapter(adaptadorAuto);
        */

        // ========================================================
        // 6. PROBAR MULTIAUTOCOMPLETETEXTVIEW (activity_multi_auto_complete.xml)
        // ========================================================
        /*
        setContentView(R.layout.activity_multi_auto_complete);
        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza", "Bilbao"};
        MultiAutoCompleteTextView multiTexto = findViewById(R.id.miMultiTexto);
        ArrayAdapter<String> adaptadorMulti = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                ciudades
        );
        multiTexto.setAdapter(adaptadorMulti);
        multiTexto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        */

        // ========================================================
        // 7. PROBAR SPINNER (activity_spinner.xml)
        // ========================================================
/*
        setContentView(R.layout.activity_spinner);
        Spinner miSpinner = findViewById(R.id.miSpinner);
        String[] valores = {"Star Wars", "Reservoir dogs", "El Club de la lucha", "Snatch: Cerdos y Diamantes"};
        ArrayAdapter<String> adaptadorSpin = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                valores
        );
        adaptadorSpin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner.setAdapter(adaptadorSpin);
        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                System.out.println("Has seleccionado el valor: " + adapterView.getItemAtPosition(pos));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        /*
        // ========================================================
        // 8. PROBAR CHECKBOX (activity_check_box.xml)
        // ========================================================
        setContentView(R.layout.activity_check_box);
        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        checkbox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                System.out.println("CheckBox seleccionado");
                Toast.makeText(this, "Casilla marcada", Toast.LENGTH_SHORT).show();
            } else {
                System.out.println("CheckBox no seleccionado");
                Toast.makeText(this, "Casilla desmarcada", Toast.LENGTH_SHORT).show();
            }
        });
        */// ========================================================
        // 9. PROBAR RADIOBUTTON (activity_radio_button.xml)
        // ========================================================

        setContentView(R.layout.activity_radio_button);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button buttonCheck = findViewById(R.id.button_check);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedOption = selectedRadioButton.getText().toString();
                    textViewResult.setText("Seleccionado: " + selectedOption);
                    Toast.makeText(MainActivity.this, "Seleccionado: " + selectedOption, Toast.LENGTH_SHORT).show();
                } else {
                    textViewResult.setText("No se ha seleccionado ninguna opción");
                    Toast.makeText(MainActivity.this, "No se ha seleccionado ninguna opción", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}