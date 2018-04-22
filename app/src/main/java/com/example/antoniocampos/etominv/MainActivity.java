package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = (Button)findViewById(R.id.sig);
       btn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent siguiente = new Intent(MainActivity.this,Registro.class);
               startActivity(siguiente);
           }


       });
        btn2 = (Button)findViewById(R.id.iniciar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this,inicioSesion.class);
                startActivity(siguiente);
            }
        });
    }
}
