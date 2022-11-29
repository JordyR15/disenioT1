package com.example.diseniot1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Enviar(View view){
        EditText id = (EditText) findViewById(R.id.txtId);
        EditText nombre = (EditText) findViewById(R.id.txtNombre);
        EditText fecha = (EditText) findViewById(R.id.txtFecha);
        EditText telefono = (EditText) findViewById(R.id.txtTelefono);
        EditText ciudad = (EditText) findViewById(R.id.txtCiudad);
        EditText correo = (EditText) findViewById(R.id.txtCorreo);

        RadioButton masculino = (RadioButton) findViewById(R.id.rdMasculino);
        RadioButton femenino = (RadioButton) findViewById(R.id.rdFemenino);

        String genero = "";

        if(masculino.isChecked()){
            genero = "Masculino";
        }else if(femenino.isChecked()){
            genero = "Femenino";
        }

        String cadena = "Id: " + id.getText() +"\nNombre: " + nombre.getText()  + "\nGénero: " + genero  + " \nFecha de nacimineto: " + fecha.getText()  + "\nTelefono: " + telefono.getText()  +
                "\nCiudad: " + ciudad.getText()  + "\nCorreo: " + correo.getText();

        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("cadena", cadena);
        startActivity(intent);
    }
}