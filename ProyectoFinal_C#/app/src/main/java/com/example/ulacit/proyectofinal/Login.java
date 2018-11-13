package com.example.ulacit.proyectofinal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        inicializaPantalla();
    }

    @Override
    public void onClick(View v){


        Toast.makeText(this,"Iniciando sesión. v0.1" , Toast.LENGTH_LONG).show();

    }

    public void inicializaPantalla(){

        Button miboton = findViewById(R.id.BtnIngresar);
        miboton.setOnClickListener(this);

        TextView email = (EditText)findViewById(R.id.TxtEmail);
        TextView pass = (EditText) findViewById(R.id.TxtPassword);

    }
}
