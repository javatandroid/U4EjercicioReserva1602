package com.example.u4ejercicioreserva1602;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void botonMainReservar(View view) {
        Intent i = new Intent(getApplicationContext(), ReservaActivity.class);
        startActivity(i);
    }

    public void botonMainVerReservas(View view) {
        Intent i = new Intent(getApplicationContext(), ListaReservaActivity.class);
        startActivity(i);
    }

    public void dialogInfo (View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogInfo dialogo = new DialogInfo();
        dialogo.show(fragmentManager, "dialogInfo");
    }


}
