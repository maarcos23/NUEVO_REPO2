package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView tvOperacion;
    private TextView tvDisplay;



    // Variables para guardar el primer número y la operación
    private double num1 = 0.0;
    private String operacion = "";

    private boolean nuevonum = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //carga el diseño del xml
        setContentView(R.layout.activity_main);

        tvOperacion = findViewById(R.id.tvOperacion);
        tvDisplay = findViewById(R.id.calculadora);

    }

    // Muestra un número sin ".0" si es entero
    private String formatear(double valor) {
        if (valor == (long) valor) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }

    // numeros
    public void clicarNumero(View view) {
        Button b = (Button) view;
        String digito = b.getText().toString();
        String textoActual = tvDisplay.getText().toString();
        if (textoActual.equals("0") || textoActual.equals("Error")) {
            tvDisplay.setText(digito);
            nuevonum= false;
        } else {
            tvDisplay.setText(textoActual + digito);
        }
    }

    //    "."
    public void clicarPunto(View view) {
        String textoActual = tvDisplay.getText().toString();

        if (textoActual.equals("Error")) {
            return;
        }

        // Control: Que no se puedan meter 2 comas/puntos en el mismo número
        if (!textoActual.contains(".")) {
            tvDisplay.setText(textoActual + ".");
            nuevonum = false;
        }
    }

    //operaciones

    public void clicarOperacion(View view) {
        String textoActual = tvDisplay.getText().toString();
        if (textoActual.equals("Error")) {
            return; // evita el crash con parseDouble
        }

        Button b = (Button) view;
        operacion = b.getText().toString();

        num1 = Double.parseDouble(textoActual);

        tvOperacion.setText(textoActual + " " + operacion);
        tvDisplay.setText("0");
        nuevonum = false;
    }

    //borrar

    // AC
    public void clicarAC(View view) {
        tvDisplay.setText("0");
        tvOperacion.setText("");
        num1 = 0.0;
        operacion = "";
        nuevonum = false;
    }

    // C
    public void clicarC(View view) {
        String textoActual = tvDisplay.getText().toString();

        if (textoActual.equals("Error")) {
            tvDisplay.setText("0");
            return;
        }

        if (textoActual.length() > 1) {
            // Quitamos el último carácter
            tvDisplay.setText(textoActual.substring(0, textoActual.length() - 1));
            nuevonum = false;
        } else {
            // Si solo queda un dígito, lo dejamos en "0"
            tvDisplay.setText("0");

        }
    }

    public void clicarIgual(View view) {
        if (tvDisplay.getText().toString().equals("Error")) {
            return; // evita el crash con parseDouble
        }

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
                tvOperacion.setText("");
                tvDisplay.setText("Error");
                operacion="";
                nuevonum= true;
                return;
            }
        }

        tvOperacion.setText(tvOperacion.getText().toString() + " " + formatear(num2) + " =");

        tvDisplay.setText(formatear(resultado));

        operacion = "";
        nuevonum=true;

    }

}