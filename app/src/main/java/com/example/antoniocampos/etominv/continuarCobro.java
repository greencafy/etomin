package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class continuarCobro extends AppCompatActivity {
Button cobro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continuar_cobro);

        cobro = (Button)findViewById(R.id.continuarPago);
        cobro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(continuarCobro.this,lectura.class);
                startActivity(siguiente);
            }
        });
    }
}
