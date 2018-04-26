package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lectura extends AppCompatActivity {
    Button continuarPago;
    private EditText pant;
    public double operan1, operan2, rest;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);

        /*continuarPago = (Button)findViewById(R.id.continuarPago);
        continuarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(lectura.this,firmar.class);
                startActivity(siguiente);
            }
        });*/

    }
    public void bt1(View v){
        String cap = pant.getText().toString();
        cap = cap+"1";
        pant.setText(cap);
    }

    public void bt2(View v){
        String cap = pant.getText().toString();
        cap = cap+"2";
        pant.setText(cap);
    }

    public void bt3(View v){
        String cap = pant.getText().toString();
        cap = cap+"3";
        pant.setText(cap);
    }

    public void bt4(View v){
        String cap = pant.getText().toString();
        cap = cap+"4";
        pant.setText(cap);
    }

    public void bt5(View v){
        String cap = pant.getText().toString();
        cap = cap+"5";
        pant.setText(cap);
    }

    public void bt6(View v){
        String cap = pant.getText().toString();
        cap = cap+"6";
        pant.setText(cap);
    }

    public void bt7(View v){
        String cap = pant.getText().toString();
        cap = cap+"7";
        pant.setText(cap);
    }

    public void bt8(View v){
        String cap = pant.getText().toString();
        cap = cap+"8";
        pant.setText(cap);
    }

    public void bt9(View v){
        String cap = pant.getText().toString();
        cap = cap+"9";
        pant.setText(cap);
    }

    public void bt0(View v){
        String cap = pant.getText().toString();
        cap = cap+"0";
        pant.setText(cap);
    }

    public void btpunto(View v){
        String cap = pant.getText().toString();
        cap = cap+".";
        pant.setText(cap);
    }

    public void delete(View v){
        if(!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0, pant.getText().length()-1)+"");
        }
    }

}
