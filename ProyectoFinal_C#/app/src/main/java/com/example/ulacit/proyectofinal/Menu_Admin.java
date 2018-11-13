package com.example.ulacit.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Admin extends AppCompatActivity implements View.OnClickListener {

    Button buttonA;
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__admin);

        inicializaPantalla();
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.articulos:
                startActivity(new Intent(Menu_Admin.this, Articulos.class));
                break;
            case R.id.clientes:
                startActivity(new Intent(Menu_Admin.this, Clientes.class));
                break;
        }
    }

    public void inicializaPantalla (){

        buttonA=(Button)findViewById(R.id.articulos);
        buttonA.setOnClickListener(this);

        buttonC=(Button)findViewById(R.id.clientes);
        buttonC.setOnClickListener(this);
    }
}
