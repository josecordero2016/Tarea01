package com.example.tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // Declarando los controles a utilizar
    private EditText et1, et2, et3;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.txtNombre);
        et2 = (EditText)findViewById(R.id.txtNacimiento);
        et3 = (EditText)findViewById(R.id.txtTelefono);
        rb1=(RadioButton)findViewById(R.id.rbMasculino);
        rb2=(RadioButton)findViewById(R.id.rbFemenino);
    }

    public void Enviar(View view){
        String nombre = et1.getText().toString();
        String nacimiento = et2.getText().toString();
        String telefono = et3.getText().toString();
        String genero = "";
        if(rb1.isChecked()) genero="Masculino";
        else if(rb2.isChecked()) genero="Femenino";
        else genero="No especificado";
        //Creacion del intent
        Intent intent = new Intent(MainActivity.this, ActivityInfo.class);
        //Información a pasarse
        Bundle b = new Bundle();
        String [] valores = {nombre,genero, nacimiento,telefono};
        //Ingresando los datos al bundle
        b.putStringArray("Valores",valores);
        //Asignando el bundle en el intent
        intent.putExtras(b);
        startActivity(intent);
    }
}