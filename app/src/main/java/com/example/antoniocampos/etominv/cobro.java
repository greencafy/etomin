package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cobro extends AppCompatActivity {
Button cobro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobro);

        cobro = (Button)findViewById(R.id.continuar);
        cobro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(cobro.this,insertarTarjeta.class);
                startActivity(siguiente);
            }
        });


    }
}