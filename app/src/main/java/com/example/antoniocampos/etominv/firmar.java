package com.example.antoniocampos.etominv;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class firmar extends AppCompatActivity {
    Button cont;
Path path = new Path();
float x = 50;
    float y = 50;
    String acion = "accion";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firmar);


        cont = (Button)findViewById(R.id.continuarPago);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(firmar.this,firmar.class);
                startActivity(siguiente);
            }
        });

    }

    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.BLUE);

        int ancho = canvas.getWidth();
        if(acion=="down");
        path.moveTo(x,y);
        if(acion=="move");
        path.lineTo(x,y);

        canvas.drawPath(path,paint);

    }

    public boolean onTouchEvent(MotionEvent e) {
        x = e.getX();
        y = e.getY();

        if (e.getAction() == MotionEvent.ACTION_DOWN)
            acion="down";
        if (e.getAction() == MotionEvent.ACTION_MOVE)
            acion="move";
       invalidateOptionsMenu();
        return true;
        }

    }
