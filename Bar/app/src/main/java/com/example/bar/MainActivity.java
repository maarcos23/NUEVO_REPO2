package com.example.bar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCamarero;
    private EditText etCuenta;
    private CheckBox cbPropina;
    private SeekBar sbPropina;
    private RadioButton rbEfectivo;
    private RatingBar rbRating;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCamarero = findViewById(R.id.autoCamarero);
        etCuenta = findViewById(R.id.etCuenta);
        cbPropina = findViewById(R.id.cbPropina);
        sbPropina = findViewById(R.id.sbPropina);
        rbEfectivo = findViewById(R.id.rbEfectivo);
        rbRating = findViewById(R.id.rbRating);
        tvResultado = findViewById(R.id.tvResultado);

        String[] camareros = {"Jose", "Lidia", "Manuela", "Marcos"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, camareros);
        autoCamarero.setAdapter(adaptador);
    }

    public void calcular(View view) {
        String texto = etCuenta.getText().toString().trim();

        // ver si está vacío
        if (texto.isEmpty()) {
            mostrarError(getString(R.string.err_vacio));
            return;
        }

        // ver q el numero es mayor que 0
        double cuenta;
        try {
            cuenta = Double.parseDouble(texto);
            if (cuenta <= 0) {
                mostrarError(getString(R.string.err_num));
                return;
            }
        } catch (Exception e) {
            mostrarError(getString(R.string.err_num));
            return;
        }

        //propina
        double propina = 0.0;
        int porcentaje = sbPropina.getProgress();
        if (cbPropina.isChecked()) {
            propina = (cuenta * porcentaje) / 100.0;
        }
        //redondeo a 2 decimales
        cuenta = Math.round(cuenta * 100.0) / 100.0;
        propina = Math.round(propina * 100.0) / 100.0;
        double tot = cuenta + propina;

        //comprobacion de pago
        String pago = "";
        if (rbEfectivo.isChecked()) {
            pago = getString(R.string.efectivo);
        } else {
            pago = getString(R.string.tarjeta);
        }

        String camarero = autoCamarero.getText().toString().trim();
        if (camarero.isEmpty()) {
            camarero = "Sin asignar";
        }

        float estrellas = rbRating.getRating();

        tvResultado.setTextColor(Color.BLACK);
        tvResultado.setText(
                "ticket \n" +
                        "Cuenta: " + cuenta + "€\n" +
                        "Propina: " + propina + "€\n" +
                        "TOTAL: " + tot + "€\n" +
                        "Pago: " + pago + "\n" +
                        "Camarero: " + camarero + "\n" +
                        "Servicio: " + estrellas + " estrellas"
        );
    }

    // error en rojo
    private void mostrarError(String mensaje) {
        tvResultado.setTextColor(Color.RED);
        tvResultado.setText(mensaje);
    }
}