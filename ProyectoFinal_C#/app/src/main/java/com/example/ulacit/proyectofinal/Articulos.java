package com.example.ulacit.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Articulos extends AppCompatActivity implements View.OnClickListener {

    Button buttonR;
    Button buttonC;
    Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulos);

        inicializaPantalla ();
    }

    @Override
    public void onClick(View v){

    }

    public void inicializaPantalla(){



    }


}
