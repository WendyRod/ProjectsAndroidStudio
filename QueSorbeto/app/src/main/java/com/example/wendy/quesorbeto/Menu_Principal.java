package com.example.wendy.quesorbeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Principal extends Activity implements View.OnClickListener{

    Button BotonC;
    Button BotonP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__principal);

        inicializaPantalla();
    }

    public void inicializaPantalla(){
        BotonC=(Button) findViewById(R.id.btn_cliente);
        BotonP=(Button) findViewById(R.id.btn_productos);

        BotonC.setOnClickListener(this);
        BotonP.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_cliente:
                startActivity(new Intent(Menu_Principal.this,Clientes.class));
                break;
        case R.id.btn_productos:
            startActivity(new Intent(Menu_Principal.this,Articulos.class));
            break;
        }
    }
}
