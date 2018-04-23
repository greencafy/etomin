package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inicioSesion extends AppCompatActivity {
TextView h;
Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        h = (TextView)findViewById(R.id.text2);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(inicioSesion.this, rescatarPin.class);
                startActivity(s);
            }
        });

        iniciar = (Button) findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(inicioSesion.this, tablas.class);
                startActivity(in);
            }
        });
    }
}
