package com.example.u4ejercicioreserva1602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class ReservaActivity extends AppCompatActivity {

    EditText etNombre, etPersonas, etObservaciones;
    Spinner spDia, spHora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        etNombre=(EditText)findViewById(R.id.etResNombre);
        etPersonas=(EditText)findViewById(R.id.etResPersonas);
        etObservaciones=(EditText)findViewById(R.id.etResObservaciones);

        spDia =(Spinner)findViewById(R.id.spRes)


    }

    public void botonReservaAceptar (View view){

    }
}
