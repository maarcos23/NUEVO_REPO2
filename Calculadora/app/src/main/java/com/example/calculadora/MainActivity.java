package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;

    // Variables para guardar el primer número y la operación
    private double num1 = 0.0;
    private String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //carga el diseño del xml
        setContentView(R.layout.activity_main);

        // para q se conecte al xml
        tvDisplay = findViewById(R.id.calculadora);
    }

    // numeros
    public void clicarNumero(View view) {
        Button b = (Button) view;
        String digito = b.getText().toString();
        String textoActual = tvDisplay.getText().toString();
        // Control: Que los números no comiencen por "0" (si hay un "0", lo reemplazamos)
        // o si venimos de pulsar una operación, limpiamos para poner el nuevo número.
        if (textoActual.equals("0") ) {
            tvDisplay.setText(digito);

        } else {
            tvDisplay.setText(textoActual + digito);
        }
    }

    //    "."
    public void clicarPunto(View view) {
        String textoActual = tvDisplay.getText().toString();

        // Control: Que no se puedan meter 2 comas/puntos en el mismo número
        if (!textoActual.contains(".")) {
            tvDisplay.setText(textoActual + ".");

        }
    }

    //operaciones

    public void clicarOperacion(View view) {
        Button b = (Button) view;
        operacion = b.getText().toString();

        // Guardamos lo que hay en pantalla como el primer número
        num1 = Double.parseDouble(tvDisplay.getText().toString());
        tvDisplay.setText("0");

        // Indicamos que el siguiente número que escribamos empezará limpio

    }

    //borrar

    // AC
    public void clicarAC(View view) {
        tvDisplay.setText("0");
        num1 = 0.0;
        operacion = "";

    }

    // C
    public void clicarC(View view) {
        String textoActual = tvDisplay.getText().toString();

        if (textoActual.length() > 1) {
            // Quitamos el último carácter
            tvDisplay.setText(textoActual.substring(0, textoActual.length() - 1));
        } else {
            // Si solo queda un dígito, lo dejamos en "0"
            tvDisplay.setText("0");

        }
    }

    public void clicarIgual(View view) {
        double num2 = Double.parseDouble(tvDisplay.getText().toString());
        double resultado = 0.0;

        if (operacion.equals("+")) {
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                tvDisplay.setText("Error");
                return;
            }
        }


        if (resultado == (long) resultado) {
            tvDisplay.setText(String.valueOf((long) resultado));
        } else {
            tvDisplay.setText(String.valueOf(resultado));
        }


    }

}