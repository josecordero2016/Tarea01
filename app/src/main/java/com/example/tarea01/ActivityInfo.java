package com.example.tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tv1 = (TextView) findViewById(R.id.lblNombre);
        tv2 = (TextView) findViewById(R.id.lblGenero);
        tv3 = (TextView) findViewById(R.id.lblNacimiento);
        tv4 = (TextView) findViewById(R.id.lblTelefono);

        //Recuperamos lo traído por el Bundle
        Bundle b = this.getIntent().getExtras();
        String valores[]=b.getStringArray("Valores");
        tv1.setText(valores[0]);
        tv2.setText(valores[1]);
        tv3.setText(valores[2]);
        tv4.setText(valores[3]);
    }
}