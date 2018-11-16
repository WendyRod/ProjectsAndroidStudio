package com.example.ulacit.proyectofinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements View.OnClickListener{

    private static EditText email;
    private static EditText password;
    private static Button ingresar_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton();
    }

    @Override
    public void onClick(View v){

        if (email.getText().toString().equals("admin@ulacit.com") && password.getText().toString().equals("admin123"))
        {
            Toast.makeText(Login.this,"Administrador", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this, Menu_Admin.class));
        }
        else if (email.getText().toString().equals("cliente@ulacit.com") && password.getText().toString().equals("cliente123"))
        {
            Toast.makeText(Login.this,"Cliente", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this, Menu_Cliente.class));
        }
        else
            Toast.makeText(getApplicationContext(), "Usuario incorrecto",Toast.LENGTH_SHORT).show();
    }

    public void LoginButton(){

        email = (EditText)findViewById(R.id.TxtEmail);
        password = (EditText)findViewById(R.id.TxtPassword);

        ingresar_button = findViewById(R.id.BtnIngresar);
        ingresar_button.setOnClickListener(this);

    }
}
