package com.example.animacionalbumfoto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = (Button) findViewById(R.id.btn1);
        Button boton2 = (Button) findViewById(R.id.btn2);
        ImageView foto = (ImageView) findViewById(R.id.photo);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        foto.setBackgroundResource(R.drawable.animacion_fotos);
        foto.setAdjustViewBounds(true);
        foto.setVisibility(View.VISIBLE);

        animacion = new AnimationDrawable();
        animacion = (AnimationDrawable) foto.getBackground();
        foto.setImageDrawable(animacion);
    }

    @Override
    public void onClick(View view) {
        animacion.stop();
        if(view.getId() == R.id.btn1){
            animacion.start();
        }else{
            animacion.stop();
        }
    }
}