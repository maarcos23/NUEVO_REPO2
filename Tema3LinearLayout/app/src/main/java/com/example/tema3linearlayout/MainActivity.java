package com.example.tema3linearlayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tema3linearlayout.R;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.frame_layout);
        //setContentView(R.layout.table_layout);
        //setContentView(R.layout.relative_layout);
        setContentView(R.layout.grid_layout);

    }
}