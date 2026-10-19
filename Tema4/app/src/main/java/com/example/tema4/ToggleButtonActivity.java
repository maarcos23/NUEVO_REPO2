package com.example.tema4;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        ToggleButton miToggleButton = findViewById(R.id.miToggleButton);

        miToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(ToggleButtonActivity.this, "Estado: Pulsado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ToggleButtonActivity.this, "Estado: No Pulsado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}