package com.example.tema4;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;

public class checkBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox checkbox1 = findViewById(R.id.checkbox1);

        // Listener para cambios en el CheckBox
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // codigo para seleccionado
                    System.out.println("CheckBox seleccionado");
                } else {
                    // codigo para no seleccionado
                    System.out.println("CheckBox no seleccionado");
                }
            }
        });
    }
}