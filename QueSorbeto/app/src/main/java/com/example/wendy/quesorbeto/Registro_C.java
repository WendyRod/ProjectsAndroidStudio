package com.example.wendy.quesorbeto;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Data.BD_Helper;
import Data.ClienteBD;

public class Registro_C extends Activity {

    Button aceptar;

    EditText txtId, txtNombre, txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__c);

        aceptar=(Button) findViewById(R.id.btnAceptar);

        txtId=(EditText) findViewById(R.id.idC);
        txtNombre=(EditText) findViewById(R.id.nombreC);
        txtTelefono=(EditText) findViewById(R.id.telefonoC);

        final BD_Helper helper = new BD_Helper((this));

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db= helper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put(ClienteBD.ID,txtId.getText().toString());
                values.put(ClienteBD.NAME,txtNombre.getText().toString());
                values.put(ClienteBD.PHONE_NUMBER,txtTelefono.getText().toString());

                long newRowId=db.insert(ClienteBD.TABLE_NAME,null,values);

                Toast.makeText(getApplicationContext(), "El registro se ha guardado correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
}
