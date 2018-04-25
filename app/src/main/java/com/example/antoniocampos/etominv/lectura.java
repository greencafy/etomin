package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lectura extends AppCompatActivity {
Button continuarPago;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);
        continuarPago = (Button)findViewById(R.id.continuarPago);
        continuarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(lectura.this,firmar.class);
                startActivity(siguiente);
            }
        });

    }
}
